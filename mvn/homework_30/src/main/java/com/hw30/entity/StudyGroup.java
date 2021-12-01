package com.hw30.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;


@Entity
    @Table(name = "studyGroup",uniqueConstraints = {
            @UniqueConstraint(columnNames = "ID")})
    @Setter
    @Getter
    @ToString
    @Accessors(chain = true)
    public class StudyGroup {

        @Id
        @GeneratedValue
        @Column(name = "id", unique = true, nullable = false)
        private Integer id;

        @Column(name = "groupName", length = 6)
        private String groupName;

        @OneToMany(cascade=CascadeType.ALL)
        @JoinColumn(name = "groupId")
        private Set<Student> students;

    }

