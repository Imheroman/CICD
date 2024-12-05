package org.example.user.service.impl;

import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.api.entity.User;
import org.example.user.adaptor.UserAdaptor;
import org.example.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserAdaptor userAdaptor;

    @Override
    public List<User> findAll() {
        return userAdaptor.findAll()
                .orElse(Collections.EMPTY_LIST);
    }
}
