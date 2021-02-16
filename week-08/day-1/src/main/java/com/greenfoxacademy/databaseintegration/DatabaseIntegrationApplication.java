package com.greenfoxacademy.databaseintegration;

import com.greenfoxacademy.databaseintegration.models.Todo;
import com.greenfoxacademy.databaseintegration.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseIntegrationApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public DatabaseIntegrationApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) {
        todoRepository.save(new Todo("I have to learn Object Related Mapping"));
        todoRepository.save(new Todo("Todo2"));
        todoRepository.save(new Todo("Todo3"));
        todoRepository.save(new Todo("Todo4"));
    }
}
