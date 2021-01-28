package com.greenfoxacademy.iamgroot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.iamgroot.model.ErrorAnnounce;
import com.greenfoxacademy.iamgroot.model.Response;
import com.greenfoxacademy.iamgroot.requestbody.Message;
import com.greenfoxacademy.iamgroot.service.ResponseServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    @MockBean
    private ResponseServiceImpl responseService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void canTranslateMessageToGroot() throws Exception {
        Message mockMessage = new Message("somemessage");
        //    Response mockResponse = responseService.translateToGroot(mockMessage);

        Response mockResponse = new Response(mockMessage.getMessage());

        when(responseService.translateToGroot(mockMessage)).thenReturn(mockResponse);

        mockMvc.perform(get("/groot")
                .param("message", "somemessage"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("translated", is("I am Groot!")))
                .andDo(print());

        //    Response expectedResponse = new Response(mockMessage.getMessage());
//
        //    when(responseService.translateToGroot(mockMessage)).thenReturn(expectedResponse);
//
        //    mockMvc.perform(get("/groot").param("message", "somemessage"))
        //            .andExpect(status().isOk())
        //            .andExpect(jsonPath("translated", is("I am Groot!")))
        //            .andDo(print());

        //   mockMvc.perform(get("/groot").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(expectedResponse)))
        //           .andExpect(status().isOk())
        //           .andExpect(content().
    }

    //@Test
    //public void canAnnounceErrorOnMissingMessage() throws Exception{
    //    ErrorAnnounce mockErrorAnnounce = new ErrorAnnounce("I am Groot!");
    //    when(responseService.error("I am Groot!")).thenReturn(mockErrorAnnounce);

    //    mockMvc.perform(get("/groot"))
    //            .andExpect(status().is4xxClientError())
    //            .andExpect(jsonPath("error", is("I am Groot!")))
    //            .andDo(print());
}