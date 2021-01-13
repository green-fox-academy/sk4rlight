package com.greenfoxacademy.dependencies.usefulutilities.controllers;

import com.greenfoxacademy.dependencies.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    UtilityService utilityService;

    @Autowired
    public MainController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String coloredBackGround(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "coloredbackground";
    }

    @GetMapping("/useful/email")
    public String emailValidator(@RequestParam String email, Model model) {
        model.addAttribute("email", email);
        model.addAttribute("isvalid", utilityService.validateMethod(email));
        return "validity";
    }

    @GetMapping("/encode")
    public String encoding(@RequestParam String text){
        return "endecode";
    }

    @GetMapping("/decode")
    public String decoding(@RequestParam Integer number){
        return "endecode";
    }
}
