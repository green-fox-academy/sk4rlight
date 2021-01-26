package com.greenfoxacademy.backendapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WhatNumbers {

    private String what;
    private Integer[] numbers;
}
