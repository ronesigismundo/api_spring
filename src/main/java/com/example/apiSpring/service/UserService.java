package com.example.apiSpring.service;

import org.springframework.stereotype.Service;
import com.example.apiSpring.model.UserModel;
import com.example.apiSpring.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    public Iterable<UserModel> findAll() {
        return userRepository.findAll();
    }

    public UserModel create(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
