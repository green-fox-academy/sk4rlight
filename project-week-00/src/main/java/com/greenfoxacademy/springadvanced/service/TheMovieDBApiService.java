package com.greenfoxacademy.springadvanced.service;

import com.greenfoxacademy.springadvanced.model.Movie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TheMovieDBApiService {

    @GET("/3/movie/{movie_id}")
    Call<Movie> callMovie(@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);

}
