package com.dlmu.song;

import com.dlmu.song.mapper.UserMapper;
import com.dlmu.song.model.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setUserName("ted");
        user1.setPassword("123ili");
        user2.setUserName("job");
        user2.setPassword("llk");
        user3.setUserName("jola");
        user3.setPassword("lknaa");
        userMapper.insertUser(user1);
        userMapper.insertUser(user2);
        userMapper.insertUser(user3);
        Assert.assertEquals(3, userMapper.getAllUser().size());
    }

    @Test
    public void getUserTest() {
        Assert.assertEquals("ted", userMapper.getUserById(1).getUserName());
    }

    @Test
    public void deleteUserTest() {
        userMapper.deleteUserById(3);
        Assert.assertEquals(2, userMapper.getAllUser().size());
    }
}
