package com.greenfoxacademy.darkestdungeonheroesclub.services;

import com.greenfoxacademy.darkestdungeonheroesclub.models.Drink;
import com.greenfoxacademy.darkestdungeonheroesclub.models.Food;
import com.greenfoxacademy.darkestdungeonheroesclub.models.Hero;
import com.greenfoxacademy.darkestdungeonheroesclub.models.Trick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HeroService {

    private List<String> trickTypeList = Arrays.asList(Trick.values().toString());
    private List<String> foodTypeList = Arrays.asList(Food.values().toString());
    private List<String> drinkTypeList = Arrays.asList(Drink.values().toString());

}
