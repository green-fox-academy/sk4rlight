package com.greenfoxacademy.theredditproject.service;

import com.greenfoxacademy.theredditproject.model.User;
import com.greenfoxacademy.theredditproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addNewUser(User user){
        user.setUserName(user.getUserName());
        user.setPassWord(user.getPassWord());
        userRepository.save(user);
    }
}
