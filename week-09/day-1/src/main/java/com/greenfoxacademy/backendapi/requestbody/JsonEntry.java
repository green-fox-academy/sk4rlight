package com.greenfoxacademy.backendapi.requestbody;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JsonEntry {

    private long id;
    @JsonProperty("endpoint")
    private String endPoint;
    private String data;
}
