package com.dlmu.j2ee.repository;

import com.dlmu.j2ee.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
