package org.example.user.service;

import java.util.List;
import org.example.api.entity.User;

public interface UserService {
    List<User> findAll();
}
