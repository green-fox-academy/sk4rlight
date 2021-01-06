package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTLoadCounterController {
    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/greetingcounter")
    public String greeting(@RequestParam String name) {
        return "Hello, " + name + ", This site was loaded " + atomicLong.getAndIncrement() + " times.";
       // return new Greeting(atomicLong.getAndIncrement(), "Hello, " + name + "!");
    }

}
