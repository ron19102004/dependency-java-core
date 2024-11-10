package org.example.services;

import org.example.models.User;

public interface IUserService {
    void save(User user);
    User findById(long id);
}
