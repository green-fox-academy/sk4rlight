package com.greenfoxacademy.darkestdungeonheroesclub.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class Hero {

    private String name;

    private List<String> trickList = new ArrayList<>();
    private List<String> foodList = new ArrayList<>();
    private List<String> drinkList = new ArrayList<>();

    public String status(){
        String statusMessage;

        if (getTrickList().isEmpty()){
            statusMessage = "Your hero knows no tricks yet. Please train him/her some.";
        } else {
            statusMessage = ", eats, drinks and knows tricks.";
        }

        return statusMessage;
    }

}
