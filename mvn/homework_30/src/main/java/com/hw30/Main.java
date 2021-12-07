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

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        StudyGroup sg = new StudyGroup();
        sg.setGroupName("AE-074");
        session.save(sg);

        StudyGroup sg1 = new StudyGroup();
        sg1.setGroupName("KK-888");
        session.save(sg1);

        Student st = new Student();
        st.setFirstName("James")
                .setLastName("Cameron")
                .setYearOfAdmission(2007)
                .setStudyGroup(sg);
        session.save(st);

        session.getTransaction().commit();

        // и проблемма еще здесь
        // я могу использовать только один метод или StudentDAO или StudyGroupDAO
        // оба метода не работают. проект не собирается
        // так же если закрыть сессию или в StudentDAO или в StudyGroupDAO проект не собирается
//        System.out.println("hello");
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.getAll();


        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();
        studyGroupDAO.getAll();


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
}
