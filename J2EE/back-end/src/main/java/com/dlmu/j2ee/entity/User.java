package com.dlmu.j2ee.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class User {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(length = 36, name = "user_id")
    private String id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String salt;
    @OneToOne
    private Role role;
}
