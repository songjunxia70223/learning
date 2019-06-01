package com.dlmu.j2ee.service;

import com.dlmu.j2ee.entity.Permission;
import com.dlmu.j2ee.entity.Role;

import java.util.List;

public interface RoleService {
    List<Permission> findRoleAllPermission(String id);
    void createRole(Role role);
}
