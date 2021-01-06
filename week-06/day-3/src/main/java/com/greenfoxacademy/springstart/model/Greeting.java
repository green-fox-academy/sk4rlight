package com.greenfoxacademy.springstart.model;

public class Greeting {

    Long id;
    String content;

    public Greeting(Long id, String content){
        this.id = id;
        this.content = content;
    }

    /// GETTERS SETTERS ///

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
