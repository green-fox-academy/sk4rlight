package com.greenfoxacademy.backendapi.service;

import com.greenfoxacademy.backendapi.model.ArrayHandlerArrayResult;
import com.greenfoxacademy.backendapi.model.WhatNumbers;
import org.springframework.stereotype.Service;

@Service
public class ArrayHandlerArrayResultService {

    public ArrayHandlerArrayResult createDoubledArrayResult(WhatNumbers whatNumbers){
        ArrayHandlerArrayResult arrayHandlerArrayResult = new ArrayHandlerArrayResult();
        arrayHandlerArrayResult.setResult(whatNumbers.getNumbers());
        for (int i = 0; i < arrayHandlerArrayResult.getResult().length; i++){
            arrayHandlerArrayResult.getResult()[i] = arrayHandlerArrayResult.getResult()[i] * 2;
        } return arrayHandlerArrayResult;
    }
}
