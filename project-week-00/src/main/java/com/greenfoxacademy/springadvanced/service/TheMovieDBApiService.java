package com.greenfoxacademy.springadvanced.service;

import com.greenfoxacademy.springadvanced.model.Movie;
import com.greenfoxacademy.springadvanced.model.ResultDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface TheMovieDBApiService {

    @GET("/3/movie/{movie_id}")
    Call<Movie> callMovie(@Path("movie_id") Integer movieId, @Query("api_key") String apiKey);

    @GET("3/movie/popular")
    Call<List<ResultDTO>> callPopularMovies(@Query("api_key") String apiKey);
}
