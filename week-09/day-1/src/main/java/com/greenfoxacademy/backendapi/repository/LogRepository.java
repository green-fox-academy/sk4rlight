package com.greenfoxacademy.backendapi.repository;

import com.greenfoxacademy.backendapi.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
