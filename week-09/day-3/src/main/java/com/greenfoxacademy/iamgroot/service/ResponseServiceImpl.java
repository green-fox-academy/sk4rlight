package com.greenfoxacademy.iamgroot.service;

import com.greenfoxacademy.iamgroot.model.ErrorAnnounce;
import com.greenfoxacademy.iamgroot.model.Response;
import com.greenfoxacademy.iamgroot.requestbody.Message;
import org.springframework.stereotype.Service;

@Service
public class ResponseServiceImpl implements ResponseService {

    @Override
    public Response translateToGroot(Message message) {
        return new Response(message.getMessage());
    }

    @Override
    public ErrorAnnounce error(String errorMessage) {
        return new ErrorAnnounce();
    }
}
