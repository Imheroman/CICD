package org.example.api.user.repository;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import org.example.api.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepositoryImpl implements UsersRepository {
    private final List<User> userList;

    public UsersRepositoryImpl() {
        this.userList = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        final List<User> users = IntStream.iterate(15, age -> age + 7)
                .limit(7)
                .mapToObj(id -> User.builder()
                        .name("name" + id)
                        .age(id)
                        .build())
                .toList();

        userList.addAll(users);
    }


    @Override
    public List<User> findAll() {
        return userList;
    }
}
