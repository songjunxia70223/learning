package com.dlmu.j2ee.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class Role {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(length = 36, name = "role_id")
    private String id;
    @Column(unique = true)
    private String role;
    @ManyToMany
    private List<Permission> permission;
}
