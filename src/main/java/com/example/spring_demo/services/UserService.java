package com.example.spring_demo.services;

import java.util.List;

import com.example.spring_demo.entities.User;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByEmail(String email);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);
}
