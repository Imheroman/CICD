package org.example.api.user.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.api.entity.User;
import org.example.api.user.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;

    public List<User> findAll() {
        return usersRepository.findAll();
    }
}
