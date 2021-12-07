package com.hw30.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student", uniqueConstraints = {
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

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "groupId", nullable = false)
    private Integer groupId;

    @Column(name = "yearOfAdmission", nullable = false)
    private Integer yearOfAdmission;

    // если раскоментить то он проект не собирается нужно коментить OneToMany в StudyGroup и пересоздавать таблицу
    // привязывается по id студента и выдает группу с таким же id
    // та же проблема и с StudyGroup
    @OneToOne //(cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    private StudyGroup studyGroup;

}
