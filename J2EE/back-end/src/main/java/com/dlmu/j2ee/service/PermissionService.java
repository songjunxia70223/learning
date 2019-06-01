package com.dlmu.j2ee.service;

import com.dlmu.j2ee.entity.Permission;

import java.util.List;

public interface PermissionService {
    void createPermission(Permission permission);
    List<Permission> findAllPermission();
}
