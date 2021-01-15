package com.greenfoxacademy.dungeonheroclub.controllers;

import com.greenfoxacademy.dungeonheroclub.models.Hero;
import com.greenfoxacademy.dungeonheroclub.services.HeroService;
import com.greenfoxacademy.dungeonheroclub.services.SustenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    private HeroService heroService;
    private SustenanceService sustenanceService;
    private Hero hero = new Hero("Dismas");

    @Autowired
    public MainController(HeroService heroService, SustenanceService sustenanceService){
        this.heroService = heroService;
        this.sustenanceService = sustenanceService;
    }

    @GetMapping ("/")
    public String rootPath(Model model, @RequestParam (required = false) String name){
        model.addAttribute("intro", heroService.introduction(heroService.selectHero(name)));
        model.addAttribute("heroList", heroService.getHeroList());
        model.addAttribute("heroListSize", heroService.getHeroList().size());
        model.addAttribute("heroName", name);
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String name){
        heroService.addHero("Dismas");
        hero.setName(name);
        heroService.addHero(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping ("/nutritionStore")
    public String getStore(){
        return "nutrition-store";
    }


}
