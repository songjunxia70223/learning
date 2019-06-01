package com.dlmu.j2ee.service.impl;

import com.dlmu.j2ee.entity.User;
import com.dlmu.j2ee.repository.UserRepository;
import com.dlmu.j2ee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean updateUser(User user) {
        if (userRepository.findById(user.getId()).isPresent()) {
            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }

}
