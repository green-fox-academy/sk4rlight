package com.greenfoxacademy.dependencies.hellobeanandcoloring.models;

import com.greenfoxacademy.dependencies.hellobeanandcoloring.services.MyColor;


public class BlueColor implements MyColor {

    @Override
    public String printColor() {
        String message = "It is blue in color...";
        return message;
    }

}
