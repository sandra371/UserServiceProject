package com.sandra.polls.user_service.repository;
import com.sandra.polls.user_service.model.User;
import java.util.List;

public interface UserRepository {

    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}