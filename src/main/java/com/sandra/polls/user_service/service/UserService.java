package com.sandra.polls.user_service.service;

import com.sandra.polls.user_service.model.User;
import java.util.List;

public interface UserService {

    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}