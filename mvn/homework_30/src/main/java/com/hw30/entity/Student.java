package com.hw30.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "student",uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")})
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "groupId")
    private Integer groupId;

    @Column(name = "yearOfAdmission")
    private Integer yearOfAdmission;
}
