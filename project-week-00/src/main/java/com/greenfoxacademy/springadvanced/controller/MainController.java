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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {

        Movie movie = movieService.getMovieById(id);

        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @GetMapping("/movie/popular")
    public List<Movie> getPopularMovies(){
        List<Movie> popularMovieList = new ArrayList<>();
        return popularMovieList;
    }

    @ResponseBody
    @GetMapping({"/", "/home"})
    public String home(){
        return ("<h1>Welcome home");
    }

    @ResponseBody
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User");
    }

    @ResponseBody
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin");
    }
}
