package me.Dio.Santander.Bootcamp.service;

import me.Dio.Santander.Bootcamp.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
