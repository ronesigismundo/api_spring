package com.example.apiSpring.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apiSpring.dto.UserDTO;
import com.example.apiSpring.model.UserModel;
import com.example.apiSpring.service.UserService;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public Iterable<UserModel> findAll() {
        return userService.findAll();
    }

    @PostMapping()
    public UserModel postUser(@Valid @RequestBody UserDTO userDTO) {
        return userService.create(userDTO.toModel());
    }

    @GetMapping("/{id}")
    public UserModel findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
