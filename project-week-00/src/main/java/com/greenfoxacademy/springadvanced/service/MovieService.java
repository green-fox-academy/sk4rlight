package com.greenfoxacademy.springadvanced.service;

import com.greenfoxacademy.springadvanced.model.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class MovieService {

    public Movie getMovieById(Integer id){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TheMovieDBApiService movieDBApiService = retrofit.create(TheMovieDBApiService.class);

        Call<Movie> movieCall = movieDBApiService.callMovie(id, System.getenv("MOVIEDB_API_KEY"));

        Movie movie = null;
        try{
            Response<Movie> movieResponse = movieCall.execute();
            System.out.println(movieResponse);
            movie = movieResponse.body();
        } catch (Exception ex){
            System.out.println("Something went wrong.");
        }
        return movie;
    }
}
