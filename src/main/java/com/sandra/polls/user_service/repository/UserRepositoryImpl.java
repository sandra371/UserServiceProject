package com.sandra.polls.user_service.repository;

import com.sandra.polls.user_service.model.User;
import com.sandra.polls.user_service.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final String USER_TABLE = "users";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO " + USER_TABLE +
                " (first_name, last_name, email, age, address, joining_date) VALUES (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(
                sql,
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAge(),
                user.getAddress(),
                user.getJoiningDate()
        );
    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE " + USER_TABLE +
                " SET first_name = ?, last_name = ?, email = ?, age = ?, address = ? WHERE id = ?";

        jdbcTemplate.update(
                sql,
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAge(),
                user.getAddress(),
                user.getId()
        );
    }

    @Override
    public void deleteUser(Long id) {
        String sql = "DELETE FROM " + USER_TABLE + " WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public User getUserById(Long id) {
        String sql = "SELECT * FROM " + USER_TABLE + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM " + USER_TABLE;
        return jdbcTemplate.query(sql, new UserMapper());
    }
}