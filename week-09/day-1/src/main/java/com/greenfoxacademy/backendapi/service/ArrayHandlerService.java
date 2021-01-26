package com.greenfoxacademy.backendapi.service;

import com.greenfoxacademy.backendapi.model.ArrayHandler;
import com.greenfoxacademy.backendapi.model.WhatNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArrayHandlerService {

    WhatNumbersService whatNumbersService;

    @Autowired
    public ArrayHandlerService(WhatNumbersService whatNumbersService) {
        this.whatNumbersService = whatNumbersService;
    }

    public ArrayHandler createArrayHandler(WhatNumbers whatNumbers) {
        switch (whatNumbers.getWhat()) {
            case "sum": {
                Integer sum = 0;
                for (int i = 0; i < whatNumbers.getNumbers().length; i++) {
                    sum = sum + whatNumbersService.getWhatNumberAtIndex(i, whatNumbers);
                }
                ArrayHandler arrayHandler = new ArrayHandler();
                arrayHandler.setResult(sum);
                return arrayHandler;
            }
            case "multiply": {
                Integer multipliedResult = 1;
                for (int i = 0; i < whatNumbers.getNumbers().length; i++) {
                    multipliedResult = multipliedResult * whatNumbersService.getWhatNumberAtIndex(i, whatNumbers);
                }
                ArrayHandler arrayHandler = new ArrayHandler();
                arrayHandler.setResult(multipliedResult);
                return arrayHandler;
            }
        }
        return null;
    }
}
