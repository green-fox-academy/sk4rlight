package com.greenfoxacademy.theredditproject.service;

import com.greenfoxacademy.theredditproject.model.Post;
import com.greenfoxacademy.theredditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void addPost(Post post) {
        post.setTitle(post.getTitle());
        post.setUrl(post.getUrl());
        postRepository.save(post);
    }

    public List<Post> collectPost() {
        return (List<Post>) postRepository.findAll();
    }

    public Post getPost(Long id) {
        if (postRepository.findById(id).isPresent()) {
            return postRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public void increaseScoreAndSave(Post post) {
        post.setScore(post.getScore() + 1);
        postRepository.save(post);
    }

    public void decreaseScoreAndSave(Post post) {
        post.setScore(post.getScore() - 1);
        postRepository.save(post);
    }

    public List<Post> sortedPostList (){
        return collectPost()
                .stream()
                .sorted(Comparator.comparing(Post::getScore).reversed())
                .collect(Collectors.toList());
    }
}
