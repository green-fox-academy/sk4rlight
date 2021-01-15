package com.greenfoxacademy.dungeonheroclub.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hero {

    private String name;
    private String food;
    private String drink;
    private List<String> trickList = new ArrayList<>();

    public Hero (@RequestParam String name){
        setName(name);
        this.food = "bread";
        this.drink = "wine";
    }

}
