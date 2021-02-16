package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.greenfoxacademy.connectionwithmysql.services.TodoService;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;
    private TodoService todoService;

    @Autowired
    public TodoController(TodoRepository todoRepository, TodoService todoService) {
        this.todoRepository = todoRepository;
        this.todoService = todoService;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        List<Todo> todoList;

        if (isActive == null) {
            todoList = (List<Todo>) todoRepository.findAll();
        } else if (isActive) {
            todoList = todoRepository.findTodosByDoneFalse();
        } else
            todoList = todoRepository.findTodosByDoneTrue();

        model.addAttribute("model", todoList);
        return "todolist";
    }

    @GetMapping("/add-todo")
    public String addTodoGetMapping() {
        return "todo-add";
    }

    @PostMapping("/add-todo")
    public String addTodoPostMapping(@ModelAttribute Todo todo) {
        todoService.addTodo(todo);
        return "redirect:";
    }

    @GetMapping("/delete-todo/{id}")
    public String deleteTodo(@ModelAttribute Todo todo, @PathVariable Long id) {
        todoService.deleteTodo(id);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/edit")
    public String editTodoGetMapping(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.getTodo(id));
        return "todo-edit";
    }

    @PostMapping("/{id}/edit")
    public String editTodoPostMapping(@ModelAttribute Todo todo, @PathVariable Long id) {
        todoService.getTodo(id).setTitle(todo.getTitle());
        todoService.getTodo(id).setDone(todo.getDone());
        todoService.getTodo(id).setUrgent(todo.getUrgent());
        todoRepository.save(todo);
        return "redirect:/todo/";
    }
}
