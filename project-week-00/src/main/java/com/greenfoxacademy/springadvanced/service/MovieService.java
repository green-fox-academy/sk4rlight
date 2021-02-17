package com.greenfoxacademy.springadvanced.service;

import com.greenfoxacademy.springadvanced.model.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class MovieService {

    public Movie getMovieById(Integer id){
    /*
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TheMovieDBApiService movieDBApiService = retrofit.create(TheMovieDBApiService.class);
    */
        TheMovieDBApiService service = TheMovieDBApiServiceGenerator.createService(TheMovieDBApiService.class);
        Call<Movie> movieCall = service.callMovie(id, System.getenv("MOVIEDB_API_KEY"));

        Movie movie = null;

        try{
            Response<Movie> movieResponse = movieCall.execute();
            System.out.println(movieResponse);
            movie = movieResponse.body();
        } catch (Exception ex){
            System.out.println("Something went wrong.");
        }
        return movie;

      /*  movieCall.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Movie movie = response.body();
                call.
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });

       */
    }
}
