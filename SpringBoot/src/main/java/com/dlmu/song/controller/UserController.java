package com.dlmu.song.controller;

import com.dlmu.song.mapper.UserMapper;
import com.dlmu.song.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<User> users = userMapper.getAllUser();
        model.addAttribute("users", users);
        return "user/list";
    }

    @RequestMapping("toAdd")
    public String toAdd() {
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(User user) {
        userMapper.insertUser(user);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, int id) {
        User user = userMapper.getUserById(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user) {
        userMapper.updateUser(user);
        return "redirect:/list";
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        userMapper.deleteUserById(id);
        return "redirect:/list";
    }
}
