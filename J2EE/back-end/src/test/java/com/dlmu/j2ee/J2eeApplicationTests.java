package com.dlmu.j2ee;

import com.dlmu.j2ee.entity.Permission;
import com.dlmu.j2ee.entity.Role;
import com.dlmu.j2ee.entity.User;
import com.dlmu.j2ee.service.PermissionService;
import com.dlmu.j2ee.service.RoleService;
import com.dlmu.j2ee.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class J2eeApplicationTests {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;
    @Autowired
    PermissionService perService;

    @Before
    public void insertData() {
        Permission p1 = new Permission();
        p1.setPermission("create");
        Permission p2 = new Permission();
        p2.setPermission("delete");
        Permission p3 = new Permission();
        p3.setPermission("edit");
        perService.createPermission(p1);
        perService.createPermission(p2);
        perService.createPermission(p3);
        List<Permission> list1 = Arrays.asList(p1, p2);
        List<Permission> list2 = Arrays.asList(p2, p3);
        Role r1 = new Role();
        r1.setRole("admin");
        r1.setPermission(list1);
        Role r2 = new Role();
        r2.setRole("employee");
        r1.setPermission(list2);
        Role r3 = new Role();
        r3.setPermission(list1);
        r3.setRole("boss");
        roleService.createRole(r1);
        roleService.createRole(r2);
        roleService.createRole(r3);
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        u1.setName("zhangsan");
        u1.setRole(r1);
        u2.setName("lisi");
        u2.setRole(r2);
        u3.setName("wangwu");
        u3.setRole(r3);
        userService.createUser(u1);
        userService.createUser(u2);
        userService.createUser(u3);
    }

    @Test
    public void contextLoads() {
        List<User> users=userService.findAllUsers();
        users.forEach(user->{
            System.out.println(user);
        });
    }

}
