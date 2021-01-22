package com.greenfoxacademy.theredditproject;

import com.greenfoxacademy.theredditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheRedditProjectApplication implements CommandLineRunner {

    PostRepository postRepository;

    @Autowired
    public TheRedditProjectApplication(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TheRedditProjectApplication.class, args);
    }

    @Override
    public void run(String... args){
     //   postRepository.save(new Post("Just a cat jamming to the best songs", "https://media.giphy.com/media/jpbnoe3UIa8TU8LM13/giphy.gif"));
     //   postRepository.save(new Post("Check out this absolute banger that made the all time ASOT Top 50!", "https://youtu.be/eRIGWAyDzD8"));
     //   postRepository.save(new Post("Have you heard of this new phenomenon called Nevgon?", "https://youtu.be/dQw4w9WgXcQ"));
     //   postRepository.save(new Post("I heard this school is lifechanging.", "https://www.greenfoxacademy.com/"));
    }
}
