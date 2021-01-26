package com.greenfoxacademy.backendapi.service;

import com.greenfoxacademy.backendapi.model.WhatNumbers;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;

@Service
public class WhatNumbersService {

    public Integer getWhatNumberAtIndex(int i, WhatNumbers whatNumbers) {
        return (Integer) Array.get(whatNumbers.getNumbers(), i);
    }
}
