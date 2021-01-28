package com.greenfoxacademy.iamgroot.service;

import com.greenfoxacademy.iamgroot.model.ErrorAnnounce;
import com.greenfoxacademy.iamgroot.model.Response;
import com.greenfoxacademy.iamgroot.requestbody.Message;


public interface ResponseService {
    Response translateToGroot(Message message);
    ErrorAnnounce error(String errorMessage);
}
