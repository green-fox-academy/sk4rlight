package com.greenfoxacademy.theredditproject.controller;

import com.greenfoxacademy.theredditproject.model.Post;
import com.greenfoxacademy.theredditproject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reddit")
public class MainController {

    PostService postService;

    @Autowired
    public MainController(PostService postService){
        this.postService = postService;
    }

    @GetMapping({"", "/", "/home"})
    public String homePage(Model model){
        model.addAttribute("postList", postService.sortedPostList());
        return "index";
    }

    @GetMapping("/submit")
    public String submitGet(){
        return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute Post post){
        postService.addPost(post);
        return "redirect:/reddit/home";
    }

    @GetMapping("/upvote/{id}")
    public String upVote(@ModelAttribute Post post, @PathVariable Long id){
        postService.increaseScoreAndSave(postService.getPost(id));
        return "redirect:/reddit/home";
    }

    @GetMapping("/downvote/{id}")
    public String downVote(@ModelAttribute Post post, @PathVariable Long id){
        postService.decreaseScoreAndSave(postService.getPost(id));
        return "redirect:/reddit/home";
    }
}
