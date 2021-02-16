package com.greenfoxacademy.theredditproject.controller;

import com.greenfoxacademy.theredditproject.model.Post;
import com.greenfoxacademy.theredditproject.model.User;
import com.greenfoxacademy.theredditproject.service.PostService;
import com.greenfoxacademy.theredditproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reddit")
public class MainController {

    PostService postService;
    UserService userService;

    @Autowired
    public MainController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping({"", "/", "/home"})
    public String homePage(Model model) {
        model.addAttribute("postList", postService.sortedPostList());
        return "index";
    }

    @GetMapping("/submit")
    public String submitGet() {
        return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute Post post) {
        if (post.getTitle() != null && post.getUrl() != null) {
            postService.addPost(post);
        }
        return "redirect:/reddit/home";
    }

    @GetMapping("/upvote/{id}")
    public String upVote(@ModelAttribute Post post, @PathVariable Long id) {
        postService.increaseScoreAndSave(postService.getPost(id));
        return "redirect:/reddit/home";
    }

    @GetMapping("/downvote/{id}")
    public String downVote(@ModelAttribute Post post, @PathVariable Long id) {
        postService.decreaseScoreAndSave(postService.getPost(id));
        return "redirect:/reddit/home";
    }

    @GetMapping("/register")
    public String registerGet() {
        return "register";
    }

    @PostMapping("/register")
    public String registerPost(@ModelAttribute User user) {
        if (user.getUserName() != null && user.getPassWord() != null) {
            userService.addNewUser(user);
        }
        return "redirect:/reddit/home";
    }
}
