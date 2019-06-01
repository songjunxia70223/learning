package com.dlmu.j2ee.service.impl;

import com.dlmu.j2ee.entity.Permission;
import com.dlmu.j2ee.repository.PermissionRepository;
import com.dlmu.j2ee.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    private final PermissionRepository repository;

    public PermissionServiceImpl(PermissionRepository permissionRepository) {
        this.repository = permissionRepository;
    }

    @Override
    public void createPermission(Permission permission) {
        repository.save(permission);
    }

    @Override
    public List<Permission> findAllPermission() {
        return repository.findAll();
    }
}
