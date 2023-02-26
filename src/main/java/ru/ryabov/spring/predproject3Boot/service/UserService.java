package ru.ryabov.spring.predproject3Boot.service;


import ru.ryabov.spring.predproject3Boot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    List<User> findAll();
    User getUserById(Long id);
}
