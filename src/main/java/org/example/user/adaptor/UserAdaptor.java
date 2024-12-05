package org.example.user.adaptor;

import java.util.List;
import java.util.Optional;
import org.example.api.entity.User;

public interface UserAdaptor {
    Optional<List<User>> findAll();
}
