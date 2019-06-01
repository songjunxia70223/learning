package com.dlmu.j2ee.service;

import com.dlmu.j2ee.entity.User;

import java.util.List;

public interface UserService {
    User findByEmail(String email);
    List<User> findAllUsers();
    void createUser(User user);
    boolean updateUser(User user);
}
