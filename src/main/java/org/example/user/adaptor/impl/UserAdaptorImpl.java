package org.example.user.adaptor.impl;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.api.entity.User;
import org.example.user.adaptor.UserAdaptor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserAdaptorImpl implements UserAdaptor {
    private final WebClient webClient;

    @Override
    public Optional<List<User>> findAll() {
        Optional<List<User>> result = webClient.get()
                .uri("/users/list")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(User.class)
                .collectList()
                .blockOptional();

        return result;
    }
}
