package com.dlmu.j2ee.repository;

import com.dlmu.j2ee.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, String> {
}
