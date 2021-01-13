package com.greenfoxacademy.dependencies.hellobeanandcoloring.models;

import com.greenfoxacademy.dependencies.hellobeanandcoloring.services.MyColor;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    @Override
    public String printColor() {
        String message = "It is red in color...";
        return message;
    }
}
