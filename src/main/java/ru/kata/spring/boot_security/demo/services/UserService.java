package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getUsers(int count);

    void saveUser(User user, Set<String> roles);

    void deleteUser(Long id);

    User getUserById(Long id);

    User findByEmail(String name);

    Set<String> getAllRolesNames();

    void initializeDB();
}
