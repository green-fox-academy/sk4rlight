package com.greenfoxacademy.springadvanced.controller;

import com.greenfoxacademy.springadvanced.model.AuthenticationRequest;
import com.greenfoxacademy.springadvanced.model.AuthenticationResponse;
import com.greenfoxacademy.springadvanced.model.Movie;
import com.greenfoxacademy.springadvanced.model.MyUserDetails;
import com.greenfoxacademy.springadvanced.service.MovieService;
import com.greenfoxacademy.springadvanced.service.MyUserDetailsService;
import com.greenfoxacademy.springadvanced.utility.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.reflect.annotation.ExceptionProxy;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MovieService movieService;

    // override in SecurityConfiguration authenticationManagerBean(){}
    // and @Bean that method
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {

        Movie movie = movieService.getMovieById(id);

        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @GetMapping("/movie/popular")
    public List<Movie> getPopularMovies() {
        List<Movie> popularMovieList = new ArrayList<>();
        return popularMovieList;
    }

    @ResponseBody
    @GetMapping({"/", "/home"})
    public String home() {
        return ("<h1>Welcome home");
    }

    @ResponseBody
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User");
    }

    @ResponseBody
    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin");
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );

        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }
        final UserDetails userDetails = myUserDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
    }
}