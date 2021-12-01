package com.hw30;

import com.hw30.DAO.StudentDAO;
import com.hw30.DAO.StudyGroupDAO;
import com.hw30.entity.StudyGroup;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        StudentDAO studentDAO = new StudentDAO();
        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();

        StudyGroup sg = new StudyGroup();
        sg.setGroupName("AE-0744");

        session.save(sg);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
