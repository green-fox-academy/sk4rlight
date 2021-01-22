package com.greenfoxacademy.theredditproject.repository;

import com.greenfoxacademy.theredditproject.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findByOrderByScoreAsc();
}
