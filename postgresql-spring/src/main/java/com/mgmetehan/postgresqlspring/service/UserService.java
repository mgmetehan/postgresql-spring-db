package com.mgmetehan.postgresqlspring.service;

import com.mgmetehan.postgresqlspring.model.User;

public interface UserService {
    User getUserById(Long id);

    User createUser(User newUser);
}
