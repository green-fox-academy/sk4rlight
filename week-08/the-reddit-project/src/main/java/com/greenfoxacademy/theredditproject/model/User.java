package com.greenfoxacademy.theredditproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String passWord;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "user")
    private List<Post> postList;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
