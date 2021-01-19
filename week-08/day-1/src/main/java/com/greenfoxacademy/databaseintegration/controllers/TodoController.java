package com.greenfoxacademy.databaseintegration.controllers;

import com.greenfoxacademy.databaseintegration.models.Todo;
import com.greenfoxacademy.databaseintegration.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public String listIsDone(@RequestParam (required = false) Boolean isActive, Model model) {
        List<Todo> todoList;

        if (isActive == null) {
            todoList = (List<Todo>) todoRepository.findAll();
        } else if (!isActive){
            todoList = todoRepository.findTodosByDoneTrue();
        } else {
            todoList = todoRepository.findTodosByDoneFalse();
        }
        model.addAttribute("model", todoList);
        return "todolist";
    }

}
