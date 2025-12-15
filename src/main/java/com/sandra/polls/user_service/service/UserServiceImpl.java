package com.sandra.polls.user_service.service;

import com.sandra.polls.user_service.model.User;
import com.sandra.polls.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        userRepository.createUser(
                new User(
                        null,
                        user.getFirstName(),
                        user.getLastName(),
                        user.getEmail(),
                        user.getAge(),
                        user.getAddress(),
                        LocalDate.now()
                )
        );
        return user;
    }

    @Override
    public User updateUser(User user) {
        userRepository.updateUser(user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}