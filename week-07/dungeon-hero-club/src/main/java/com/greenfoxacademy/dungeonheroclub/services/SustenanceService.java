package com.greenfoxacademy.dungeonheroclub.services;

import com.greenfoxacademy.dungeonheroclub.models.DrinkType;
import com.greenfoxacademy.dungeonheroclub.models.FoodType;
import com.greenfoxacademy.dungeonheroclub.models.TrickType;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class SustenanceService {

    private List<TrickType> trickTypeList = Arrays.asList(TrickType.values());
    private List<FoodType> foodTypeList = Arrays.asList(FoodType.values());
    private List<DrinkType> drinkTypeList = Arrays.asList(DrinkType.values());


    private String selectTrickType(TrickType trickType) {
        return switch (trickType) {
            case HTML -> "write HTML";
            case JAVA -> "code in Java";
        };
    }

    private String selectFoodType(FoodType foodType) {
        String food = getFoodTypeList().stream()
                .filter(x -> x.equals(foodType))
                .findFirst()
                .toString();
        return food;
    }

    private String selectDrinkType(DrinkType drinkType) {
        String drink = getDrinkTypeList().stream()
                .filter(x -> x.equals(drinkType))
                .findFirst()
                .toString();
        return drink;
    }
}
