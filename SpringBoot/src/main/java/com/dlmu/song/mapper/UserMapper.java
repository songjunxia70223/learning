package com.dlmu.song.mapper;

import com.dlmu.song.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUser();

    User getUserById(int id);

    void insertUser(User user);

    void deleteUserById(int id);

    void updateUser(User user);

    void deleteAllUser();
}
