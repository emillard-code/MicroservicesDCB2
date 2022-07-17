package com.project.service;

import com.project.model.User;
import com.project.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {

        log.info("Inside saveUser of UserService");
        return userRepository.save(user);

    }

}
