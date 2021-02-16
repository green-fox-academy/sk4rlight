package com.greenfoxacademy.springadvanced.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {

    private Integer id;
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;
    private String title;

}
