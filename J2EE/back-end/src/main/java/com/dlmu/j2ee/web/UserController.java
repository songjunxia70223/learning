package com.dlmu.j2ee.web;

import com.dlmu.j2ee.entity.User;
import com.dlmu.j2ee.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userServiceImpl;

    public UserController(UserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public User getUser(@PathVariable("email") String email) {
        return userServiceImpl.findByEmail(email);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String saveUser(@RequestBody User user) {
        System.out.println();
        return "success";
    }
}
