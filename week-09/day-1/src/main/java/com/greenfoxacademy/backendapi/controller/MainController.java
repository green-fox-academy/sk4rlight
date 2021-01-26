package com.greenfoxacademy.backendapi.controller;

import com.greenfoxacademy.backendapi.model.*;
import com.greenfoxacademy.backendapi.requestbody.JsonEntry;
import com.greenfoxacademy.backendapi.service.ArrayHandlerArrayResultService;
import com.greenfoxacademy.backendapi.service.ArrayHandlerService;
import com.greenfoxacademy.backendapi.service.LogEntryService;
import com.greenfoxacademy.backendapi.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    ArrayHandlerService arrayHandlerService;
    ArrayHandlerArrayResultService arrayHandlerArrayResultService;
    LogService logService;
    LogEntryService logEntryService;

    @Autowired
    public MainController (ArrayHandlerService arrayHandlerService, ArrayHandlerArrayResultService arrayHandlerArrayResultService, LogService logService, LogEntryService logEntryService){
        this.arrayHandlerService = arrayHandlerService;
        this.arrayHandlerArrayResultService = arrayHandlerArrayResultService;
        this.logService = logService;
        this.logEntryService = logEntryService;
    }

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/doubling")
    public ResponseEntity<?> doubleInput(@RequestParam(required = false) Integer input) {


        if (input != null) {

            InputDTO inputDTO = new InputDTO();

            inputDTO.setReceived(input);
            inputDTO.setResult(inputDTO.getReceived() * 2);

            return new ResponseEntity<>(inputDTO, HttpStatus.OK);
        }
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setError("Please provide an input!");
        return new ResponseEntity<>(errorDTO, HttpStatus.OK);

    }

    @ResponseBody
    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (title == null && name == null) {
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("Please provide a name and a title!");
            return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
        } else if (name == null) {
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("Please provide a name!");
            return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
        } else if (title == null) {
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("Please provide a title!");
            return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
        } else {
            GreeterDTO greeterDTO = new GreeterDTO();
            greeterDTO.setWelcomeMessage("Oh, hi there " + name + ", my dear " + title + "!");
            return new ResponseEntity<>(greeterDTO, HttpStatus.OK);
        }
    }

    @ResponseBody
    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appendLetter(@PathVariable(required = false) String appendable) {
        if (appendable == null) {
            return (ResponseEntity<?>) ResponseEntity.notFound();
        }
        AppendLetter appendLetter = new AppendLetter();
        appendLetter.setAppended(appendable + "a");
        return new ResponseEntity<>(appendLetter, HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody NumberDTO numberDTO) {
        if (numberDTO.getUntil() == null) {
            ErrorDTO errorDTO = new ErrorDTO();

            errorDTO.setError("Please provide a number!");
            return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
        } else if (action.equals("sum")) {
            DoUntil doUntil = new DoUntil();

            doUntil.setResult(numberDTO.getUntil() * (numberDTO.getUntil() + 1) / 2);
            return new ResponseEntity<>(doUntil, HttpStatus.OK);
        } else if (action.equals("factor")) {

            DoUntil doUntil = new DoUntil();

            int factorial = 1;

            for (int i = 1; i< numberDTO.getUntil() + 1; i++){
               factorial = factorial * i;
            }

        //    Integer factorial = Math.toIntExact(CombinatoricsUtils.factorial(numberDTO.getUntil()));
            doUntil.setResult(factorial);
            return new ResponseEntity<>(doUntil, HttpStatus.OK);
        }
        return null;
    }

    @ResponseBody
    @PostMapping("/arrays")
    public ResponseEntity<?> handleArray (@RequestBody WhatNumbers whatNumbers){
        if (whatNumbers.getWhat() == null || whatNumbers.getNumbers() == null){
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("Please provide what to do with the numbers!");
            return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
        } else if (whatNumbers.getWhat().equals("double")){
            return new ResponseEntity<>(arrayHandlerArrayResultService.createDoubledArrayResult(whatNumbers), HttpStatus.OK);
        } return new ResponseEntity<>(arrayHandlerService.createArrayHandler(whatNumbers), HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/log")
    public ResponseEntity<?> handleLogEntry (@RequestBody JsonEntry jsonEntry){
        if (jsonEntry == null){
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("No log entries have been provided.");
            return new ResponseEntity<>(errorDTO, HttpStatus.NOT_FOUND);
        } else {
            LogEntry logEntry = new LogEntry();
            logEntryService.addAllLogsToEntryList(logEntry);
            return new ResponseEntity<>(logEntry,HttpStatus.OK);
        }
    //    logEntryService.saveLogEntries(logEntry);
    //    logEntryService.increaseEntryCount(logEntry);
    //    return new ResponseEntity<>(logEntryService.listAllLogs(), HttpStatus.OK);
    }
}
