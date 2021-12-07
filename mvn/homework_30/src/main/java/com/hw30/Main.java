package com.hw30;

import com.hw30.DAO.StudentDAO;
import com.hw30.DAO.StudyGroupDAO;
import com.hw30.entity.Student;
import com.hw30.entity.StudyGroup;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        StudyGroup sg = new StudyGroup();
        sg.setGroupName("AM-031");
        session.save(sg);

        Student st = new Student();
        st.setFirstName("Roger")
                .setLastName("Taylor")
                .setYearOfAdmission(2003)
                .setStudyGroup(sg);
        session.save(st);

        session.getTransaction().commit();*/


        StudentDAO studentDAO = new StudentDAO();
        //print(studentDAO.getAll());


        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();
        //print(studyGroupDAO.getAll());

        //print((List) studentDAO.getStudentById(3));
        System.out.println(studentDAO.getStudentById((Integer) 1));

        // тестовые данные
/*
        create database test;
        use test;
        select * from student;
        select * from studygroup;
        drop schema test;

        insert into studygroup(groupName) values
                ('AA-075'),
                ('AI-082'),
                ('AX-696');

        insert into student (firstName, lastName, yearOfAdmission, groupId) values
                ('Alex','Band',2005,3),
                ('Brenth','Smith',2005,2),
        ('Petr','Ivanov',2005,1),
        ('Max','Samsov',2005,1),
        ('Pat','Smear',2005,1),
        ('Ringo','Starr',2005,2);*/

    }
    public static void print(List list){

        if (list != null && !list.isEmpty()) {
            for (Object st : list)
                System.out.println(st);
        }

    }
}
