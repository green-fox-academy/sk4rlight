package com.greenfoxacademy.springadvanced.repository;

import com.greenfoxacademy.springadvanced.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
