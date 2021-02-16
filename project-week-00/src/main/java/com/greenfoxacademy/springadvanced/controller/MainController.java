package com.greenfoxacademy.springadvanced.controller;

import com.greenfoxacademy.springadvanced.model.Movie;
import com.greenfoxacademy.springadvanced.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    MovieService movieService;

   @GetMapping("/movie")
   public ResponseEntity<Movie> getMovie(){
        Movie movie = movieService.getMovieById(5);
        return new ResponseEntity<>(movie, HttpStatus.OK);
   }
}
