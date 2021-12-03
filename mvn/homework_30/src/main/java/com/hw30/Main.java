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

/*        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();*/

/*      StudyGroup sg = new StudyGroup();
        sg.setGroupName("AA-128");
        session.save(sg);

        Student st = new Student();
        st.setFirstName("Christopher")
                .setLastName("Nolan")
                .setGroupId(3)
                .setYearOfAdmission(2012);
        session.save(st);

        session.getTransaction().commit();
        */

/*        Query query = session.createQuery("FROM student");
        List<Student> list = (List<Student>) query.list();
        session.getTransaction().commit();
        session.close();

        for (Student st1 : list) {
            System.out.println(st1);
        }*/

        //HibernateUtil.shutdown();
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.getAll();

    }
}
