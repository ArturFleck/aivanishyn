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
        st.setId(21)
                .setFirstName("Gerry")
                .setLastName("Beausy")
                .setYearOfAdmission(2002)
                .setStudyGroup(studentDAO.getStudentById(2).getStudyGroup()); // Taking StudyGroup from other Student
        System.out.println(studentDAO.saveOrUpdate(st));*/


        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();
        //printList(studyGroupDAO.getAll());

        //System.out.println(studyGroupDAO.getStudyGroupById(2));

/*        StudyGroup sg = new StudyGroup();
        sg.setId(7)
                .setGroupName("AW-02X");
        System.out.println( studyGroupDAO.saveOrUpdate(sg));*/

    }
    public static void printList(List list){
        if (list != null && !list.isEmpty()) {
            for (Object st : list)
                System.out.println(st);
        }
    }
}
