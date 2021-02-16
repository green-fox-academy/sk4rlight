package com.greenfoxacademy.theredditproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url;
    private Integer score;
    private Timestamp timestamp;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Post(String title, String url) {
        Date date = new Date();
        setTitle(title);
        setUrl(url);
        setScore(0);
        setTimestamp(new Timestamp(date.getTime()));
    }
}
