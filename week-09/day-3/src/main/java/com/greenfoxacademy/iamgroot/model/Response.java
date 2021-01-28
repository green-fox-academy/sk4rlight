package com.greenfoxacademy.iamgroot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private String received;
    private String translated;

    public Response(String received){
        setReceived(received);
        setTranslated("I am Groot!");
    }
}
