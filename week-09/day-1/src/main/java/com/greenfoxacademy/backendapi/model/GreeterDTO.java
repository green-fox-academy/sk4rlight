package com.greenfoxacademy.backendapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GreeterDTO {

    @JsonProperty(value="welcome_message")
    private String welcomeMessage;
}
