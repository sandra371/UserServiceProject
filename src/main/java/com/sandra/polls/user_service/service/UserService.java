package com.sandra.polls.user_service.service;

import com.sandra.polls.user_service.model.User;

import java.util.List;

public interface UserService {

    int createUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    int updateUser(User user);
    int deleteUser(Long id);
}