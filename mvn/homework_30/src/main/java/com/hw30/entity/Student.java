package com.hw30.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

@Entity
@Table(name = "student", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")})
@Setter
@Getter
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

    @Column(name = "yearOfAdmission", nullable = false)
    private Integer yearOfAdmission;

    @ManyToOne
    @JoinColumn(name="study_group_id", nullable = false)
    private StudyGroup studyGroup;

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("yearOfAdmission=" + yearOfAdmission)
                .add("studyGroup=" + studyGroup.getGroupName())
                .toString();
    }
}
