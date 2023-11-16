package org.example.services;

import org.example.entities.User;
import org.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImplement{

    @Autowired
    private  UserRepo userRepository;

    public UserServiceImplement() {
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
