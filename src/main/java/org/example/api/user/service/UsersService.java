package org.example.api.user.service;

import java.util.List;
import org.example.api.entity.User;

public interface UsersService {
    List<User> findAll();
}
