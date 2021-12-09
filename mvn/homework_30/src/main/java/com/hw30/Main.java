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

/*        Student st = new Student();
        st.setId(1)
                .setFirstName("Son")
                .setLastName("Jamm")
                .setYearOfAdmission(2022)
                .setStudyGroup(studentDAO.getStudentById(1).getStudyGroup()); //// HERE IS THE PROBLEM
        System.out.println(st);                             // Before saving
        System.out.println(studentDAO.saveOrUpdate(st));    // After saving*/

        //printList(studentDAO.findByLastNameContaining("ar"));

        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();
        //printList(studyGroupDAO.getAll());
        //System.out.println(studyGroupDAO.getStudyGroupById(2));
        StudyGroup sg = new StudyGroup();
        sg.setId(1)
                .setGroupName("AX-XXX");
        studyGroupDAO.saveOrUpdate(sg);

    }
    public static void printList(List list){
        if (list != null && !list.isEmpty()) {
            for (Object st : list)
                System.out.println(st);
        }
    }
}
