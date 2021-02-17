package com.greenfoxacademy.springadvanced.service;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TheMovieDBApiServiceGenerator {

    private static final String BASE_URL = "https://api.themoviedb.org";

    private static Retrofit.Builder builder
            = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static <TheMovieDBApiService> TheMovieDBApiService createService(Class<TheMovieDBApiService> service) {
        return retrofit.create(service);
    }
}
