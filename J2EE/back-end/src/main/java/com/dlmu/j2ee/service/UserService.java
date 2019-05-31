package com.dlmu.j2ee.service;

import com.dlmu.j2ee.entity.User;

import java.util.List;

public interface UserService {
    User findByEmail(String email);
    List<User> findByName(String name);
    void insertUser(User user);
    void deleteById(String id);
    void updateUser(User user);
}
