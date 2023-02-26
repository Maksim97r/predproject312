package ru.ryabov.spring.predproject3Boot.dao;


import ru.ryabov.spring.predproject3Boot.model.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    List<User> findAll();
    User getUserById(Long id);

}
