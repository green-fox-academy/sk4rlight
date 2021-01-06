package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping(value="/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}