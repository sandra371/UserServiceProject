package com.sandra.polls.user_service.service;
import com.sandra.polls.user_service.client.PollAnswerClient;
import com.sandra.polls.user_service.model.User;
import com.sandra.polls.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PollAnswerClient pollAnswerClient;

    // Constructor injection
    public UserServiceImpl(UserRepository userRepository, PollAnswerClient pollAnswerClient) {
        this.userRepository = userRepository;
        this.pollAnswerClient = pollAnswerClient;
    }

    @Override
    public int createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public int deleteUser(Long id) {
        pollAnswerClient.deleteAnswersByUserId(id);
        return userRepository.deleteUser(id);
    }
}