package com.greenfoxacademy.databaseintegration.repositories;

import com.greenfoxacademy.databaseintegration.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
