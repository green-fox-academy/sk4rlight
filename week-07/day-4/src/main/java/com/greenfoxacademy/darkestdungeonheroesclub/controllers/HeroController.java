package com.greenfoxacademy.darkestdungeonheroesclub.controllers;

import com.greenfoxacademy.darkestdungeonheroesclub.models.Hero;
import com.greenfoxacademy.darkestdungeonheroesclub.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HeroController {

    Hero hero;
    HeroService heroService;

    @Autowired
    public HeroController(Hero hero, HeroService heroService){
        this.hero = hero;
        this.heroService = heroService;
    }

    @PostMapping("/nutritionStore")
    public String nutritionStore (Model model, String food, String drink){
        hero.getFoodList().add(food);
        hero.getDrinkList().add(drink);
        model.addAttribute("heroService", heroService);
        model.addAttribute("hero", hero);
        return "index";
    }
}
