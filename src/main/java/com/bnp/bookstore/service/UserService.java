package com.bnp.bookstore.service;

import com.bnp.bookstore.model.User;
import com.bnp.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(String username){

        return userRepository.findByUsername(username);
    }
}
