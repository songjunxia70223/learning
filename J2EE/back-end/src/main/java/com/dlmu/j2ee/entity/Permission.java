package com.dlmu.j2ee.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@GenericGenerator(name = "uuid2",strategy = "org.hibernate.id.UUIDGenerator")
public class Permission {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(length = 36,name = "permission_id")
    private String id;
    @Column(unique = true)
    private String permission;
}
