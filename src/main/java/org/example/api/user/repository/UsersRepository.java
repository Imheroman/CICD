package org.example.api.user.repository;

import java.util.List;
import org.example.api.entity.User;

public interface UsersRepository {
    List<User> findAll();
}
