package com.greenfoxacademy.dungeonheroclub.services;

import com.greenfoxacademy.dungeonheroclub.models.Hero;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Service
public class HeroService {

    private List<Hero> heroList = new ArrayList<>();

    public String introduction(Hero hero){
        String intro = "This is " + hero.getName() +
                ". Currently surviving on " + hero.getFood() +
                " and " + hero.getDrink() +
                ". He knows " + hero.getTrickList().size() +
                " tricks.";
        return intro;
    }

    public void addHero(String name){
        Hero newHero = new Hero(name);
        if (!heroList.contains(newHero)) {
            heroList.add(newHero);
        }
    }

    public Hero selectHero(String name){

        Optional<Hero> selectedHero = heroList.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();

        if(selectedHero.isPresent()){
            return selectedHero.get();
        }
        return new Hero("Dismas");
    }
}
