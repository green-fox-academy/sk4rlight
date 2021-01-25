package com.greenfoxacademy.backendapi.controller;

import com.greenfoxacademy.backendapi.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class MainController {

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

            return new ResponseEntity<InputDTO>(inputDTO, HttpStatus.OK);
        }
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setError("Please provide an input!");
        return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.OK);

    }

    @ResponseBody
    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (title == null && name == null) {
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("Please provide a name and a title!");
            return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.BAD_REQUEST);
        } else if (name == null) {
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("Please provide a name!");
            return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.BAD_REQUEST);
        } else if (title == null) {
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setError("Please provide a title!");
            return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.BAD_REQUEST);
        } else {
            GreeterDTO greeterDTO = new GreeterDTO();
            greeterDTO.setWelcomeMessage("Oh, hi there " + name + ", my dear " + title + "!");
            return new ResponseEntity<GreeterDTO>(greeterDTO, HttpStatus.OK);
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
        return new ResponseEntity<AppendLetter>(appendLetter, HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody NumberDTO numberDTO) {
        if (numberDTO.getUntil() == null) {
            ErrorDTO errorDTO = new ErrorDTO();

            errorDTO.setError("Please provide a number!");
            return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.NOT_FOUND);
        } else if (action.equals("sum")) {
            DoUntil doUntil = new DoUntil();

            doUntil.setResult(numberDTO.getUntil() * (numberDTO.getUntil() + 1) / 2);
            return new ResponseEntity<DoUntil>(doUntil, HttpStatus.OK);
        } else if (action.equals("factor")) {

            DoUntil doUntil = new DoUntil();

            int factorial = 1;

            for (int i = 1; i< numberDTO.getUntil() + 1; i++){
               factorial = factorial * i;
            }

        //    Integer factorial = Math.toIntExact(CombinatoricsUtils.factorial(numberDTO.getUntil()));
            doUntil.setResult(factorial);
            return new ResponseEntity<DoUntil>(doUntil, HttpStatus.OK);
        }
        return null;
    }

    //    JSONObject jsonObject = new JSONObject();
    //    jsonObject.put("until", number);
//
    //    if (number == null) {
    //        ErrorDTO errorDTO = new ErrorDTO();
    //        errorDTO.setError("Please provide a number!");
    //        return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.NOT_FOUND);
    //    } else if (action.equals("sum")) {
    //        DoUntil doUntilDTO = new DoUntil();
    //        doUntilDTO.setResult(number * (number + 1) / 2);
    //        return new ResponseEntity<DoUntil>(doUntilDTO, HttpStatus.OK);
    //    } else if (action.equals("factor")) {
    //        DoUntil doUntilDTO = new DoUntil();
    //        Integer factorial = Math.toIntExact(CombinatoricsUtils.factorial(number));
    //        doUntilDTO.setResult(factorial);
    //        return new ResponseEntity<DoUntil>(doUntilDTO, HttpStatus.OK);
    //    }


}
