package com.dlmu.j2ee.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class User {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(length = 36)
    private String id;
    private String name;
    private String email;
    private String password;
}
