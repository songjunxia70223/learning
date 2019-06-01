package com.dlmu.j2ee.service.impl;

import com.dlmu.j2ee.entity.Permission;
import com.dlmu.j2ee.entity.Role;
import com.dlmu.j2ee.repository.RoleRepository;
import com.dlmu.j2ee.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Permission> findRoleAllPermission(String id) {
        Optional<Role> role = repository.findById(id);
        return role.map(Role::getPermission).orElse(null);
    }

    @Override
    public void createRole(Role role) {
        repository.save(role);
    }
}
