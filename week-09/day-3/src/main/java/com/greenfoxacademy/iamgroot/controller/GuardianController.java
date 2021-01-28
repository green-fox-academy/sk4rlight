package com.greenfoxacademy.iamgroot.controller;

import com.greenfoxacademy.iamgroot.requestbody.Message;
import com.greenfoxacademy.iamgroot.service.ResponseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuardianController {

    ResponseServiceImpl responseService;

    @Autowired
    public GuardianController(ResponseServiceImpl responseService){
        this.responseService = responseService;
    }

    @ResponseBody
    @GetMapping("/groot")
    public ResponseEntity<?> grootRoot (@RequestBody Message message){
        if (message == null){
            return new ResponseEntity<>(responseService.error("I am Groot!"), HttpStatus.BAD_REQUEST);
        } return new ResponseEntity<>(responseService.translateToGroot(message), HttpStatus.OK);
    }
}
