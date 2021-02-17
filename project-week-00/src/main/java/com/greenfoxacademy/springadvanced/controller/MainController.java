package com.greenfoxacademy.springadvanced.controller;

import com.greenfoxacademy.springadvanced.model.Movie;
import com.greenfoxacademy.springadvanced.service.MovieService;
import com.greenfoxacademy.springadvanced.service.TheMovieDBApiServiceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {

        Movie movie = movieService.getMovieById(id);

        return new ResponseEntity<>(movie, HttpStatus.OK);

    }
}
