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
        //printList(studentDAO.getAll());

        //System.out.println(studentDAO.getStudentById(3));

        //printList(studentDAO.findByLastNameContaining("ar"));

/*        Student st = new Student();
        st.setId(11)
                .setFirstName("Gerry")
                .setLastName("Beausy")
                .setYearOfAdmission(2005)
                .setStudyGroup(studentDAO.getStudentById(2).getStudyGroup()); // Taking StudyGroup from other Student
        System.out.println(studentDAO.saveOrUpdate(st));*/


        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();
        //printList(studyGroupDAO.getAll());

        //System.out.println(studyGroupDAO.getStudyGroupById(2));

        StudyGroup sg = new StudyGroup();
        sg.setId(12)
                .setGroupName("AS-555");
        System.out.println(studyGroupDAO.saveOrUpdate(sg));

    }

    public static void printList(List list) {
        if (list != null && !list.isEmpty()) {
            for (Object st : list)
                System.out.println(st);
        }
    }
}

/**
 * TEST DATA
 */
/*    drop schema test;
        create database test;
        use test;
        select * from student;
        select * from studygroup;

insert into studyGroup (groupName) values
('AI-085'),
('AC-063'),
('AA-162'),
('AE-074');

insert into student(firstName, lastName, yearOfAdmission, study_group_id) values
('Christopher','Nolan',2012,1),
('Cris','Columbus',2013,2),
('Redley','Scott',2005,1),
('James','Cameron',2007,3),
('Alex','Band',2005,3),
('Brenth','Smith',2005,2),
('Petr','Ivanov',2005,1),
('Max','Paine',2005,1),
('Pat','Smear',2005,1),
('Ringo','Starr',2005,2);*/
