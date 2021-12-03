package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class StudentDAO {
    //public Student get(Integer id){}
    //public Student saveOrUpdate (Student student){}

    public List<Student> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query query = session.createQuery("FROM Student");
        List<Student> list = (List<Student>) query.list();
        session.getTransaction().commit();
        session.close();

        //if (list != null && !list.isEmpty()) {
            for (Student st : list)
                System.out.println(st);
        //}

        HibernateUtil.shutdown();
        return null;
    }

    //public List<Student> findByNameContaining(String partOfFullName){}
}
