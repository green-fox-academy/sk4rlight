package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.Hellos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RandomHelloController {

    @RequestMapping("/randomhello")
    public String randomHelloFunction(Hellos hellos, Model model, @RequestParam String fontColor, @RequestParam Integer fontSize) {

        model.addAttribute("randomHello", hellos.getRandomHello());
        model.addAttribute("fontColor", fontColor);
        model.addAttribute("fontSize", fontSize);

        return "internationalhellos";
    }
}
