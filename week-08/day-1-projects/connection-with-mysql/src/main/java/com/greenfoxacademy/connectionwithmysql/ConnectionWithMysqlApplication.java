package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMysqlApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public ConnectionWithMysqlApplication(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMysqlApplication.class, args);
    }

    @Override
    public void run(String... args){
    //    todoRepository.save(new Todo("TODO1", false, true));
    //    todoRepository.save(new Todo("TODO2", true, false));
    //    todoRepository.save(new Todo("TODO3", false, false));
    //    todoRepository.save(new Todo("TODO4", true, false));
    //    todoRepository.save(new Todo("TODO5", true, true));
    //    todoRepository.save(new Todo("TODO6", false, true));
    }
}
