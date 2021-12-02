package com.hw30;

import com.hw30.DAO.StudentDAO;
import com.hw30.DAO.StudyGroupDAO;
import com.hw30.entity.Student;
import com.hw30.entity.StudyGroup;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        StudentDAO studentDAO = new StudentDAO();
        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();

        StudyGroup sg = new StudyGroup();
        sg.setGroupName("AI-108");

        Student st = new Student();
        st.setFirstName("Chad")
                .setLastName("Gray")
                .setGroupId(3)
                .setYearOfAdmission(2010);

        //session.save(sg);
        //session.save(st);



        Query query = session.createQuery("FROM student where id=2");
        List list = query.list();

        System.out.println(list);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
