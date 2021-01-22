package com.greenfoxacademy.theredditproject.repository;

import com.greenfoxacademy.theredditproject.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
