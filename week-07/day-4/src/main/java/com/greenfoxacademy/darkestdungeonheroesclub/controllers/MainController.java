package com.greenfoxacademy.darkestdungeonheroesclub.controllers;

import com.greenfoxacademy.darkestdungeonheroesclub.models.Drink;
import com.greenfoxacademy.darkestdungeonheroesclub.models.Food;
import com.greenfoxacademy.darkestdungeonheroesclub.models.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    Hero hero;

    @Autowired
    public MainController(Hero hero){
        this.hero = hero;
    }

    @GetMapping ("/")
    public String root(){
        return "index";
    }

    @GetMapping ("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String name, Model model){
        hero.setName(name);
        model.addAttribute("hero", hero);
        return "redirect:/";
    }

    @PostMapping("/trickCenter")
    public String trickCenter(){
        return "";
    }

}
