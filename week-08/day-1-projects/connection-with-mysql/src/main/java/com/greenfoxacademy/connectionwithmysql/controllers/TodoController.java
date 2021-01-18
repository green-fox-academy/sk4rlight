package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    @RequestMapping("/todo")
    public class TodoController {

        private TodoRepository todoRepository;

        @Autowired
        public TodoController(TodoRepository todoRepository){
            this.todoRepository = todoRepository;
        }

        @GetMapping(value={"", "/", "/list"})
        public String list(Model model, @RequestParam Boolean isActive){
            model.addAttribute("model", todoRepository.findAll());
            return "todolist";
        }
}
