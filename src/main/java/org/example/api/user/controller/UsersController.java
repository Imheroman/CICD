package org.example.api.user.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.api.entity.User;
import org.example.api.user.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;

    @GetMapping("/list")
    public List<User> findAllUser() {
        final List<User> users = usersService.findAll();
        return users;
    }
}
