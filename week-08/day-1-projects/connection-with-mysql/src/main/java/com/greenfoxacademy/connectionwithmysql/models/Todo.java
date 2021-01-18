package com.greenfoxacademy.connectionwithmysql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean urgent = false;
    private Boolean done = false;

    public Todo(String title) {
        setTitle(title);
    }

    public Todo(String title, Boolean done, Boolean urgent) {
        setTitle(title);
        setDone(done);
        setUrgent(urgent);
    }

    public Boolean isDone() {
        return getDone();
    }

    public Boolean isUrgent() {
        return getUrgent();
    }
}
