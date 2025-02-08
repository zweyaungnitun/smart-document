package com.smartai.documentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.smartai.documentmanagement.entity.User;

public interface UserService {
    User save(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User update(Long id,User user);
    void deleteUser(Long id);
}
