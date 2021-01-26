package com.greenfoxacademy.backendapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp createdAt;
    private String endPoint;
    private String data;

    public Log(Long id, String endPoint, String data){
        Date date = new Date();
        setCreatedAt(new Timestamp(date.getTime()));
        setEndPoint(endPoint);
        setData(data);
        setId(id);
    }
}
