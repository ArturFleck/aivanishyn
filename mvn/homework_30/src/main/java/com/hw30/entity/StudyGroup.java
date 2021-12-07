package com.hw30.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "studyGroup", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")})
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class StudyGroup {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "groupName", nullable = false)
    private String groupName;

    // если раскоментить то не собирается проект нужно комментить OneToOne в Student
    // но здесь хотябы подставляет правильно студентов к группе
    /*@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="groupId")
    private Set<Student> students = new HashSet<Student>();*/
}

