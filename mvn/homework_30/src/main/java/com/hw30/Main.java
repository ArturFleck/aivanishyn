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
        session.beginTransaction();

        StudyGroup sg = new StudyGroup();
        sg.setGroupName("AE-074");
        session.save(sg);

        Student st = new Student();
        st.setFirstName("James")
                .setLastName("Cameron")
                .setGroupId(1)
                .setYearOfAdmission(2007);
        session.save(st);

        session.getTransaction().commit();
        HibernateUtil.shutdown();*/

        // Problems are HERE. I can use only one method. If I use both than nothing is work.
        // if I close session in StudentDAO then StudyGroupDAO.getAll() will crash.
        // I wrote @ManyToOne() at studentDao, but it creates new column. Or there is no need to create @ManyToOne() at studentDao?
        // I thought that it should show name of student group from table StudyGroup.name automatically, but it shouldn't create new column
        // at studyGroupDAO.getAll() it gives associations with students that are included in group as needed by task
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.getAll();

/*        StudyGroupDAO studyGroupDAO = new StudyGroupDAO();
        studyGroupDAO.getAll();*/

    }
}
