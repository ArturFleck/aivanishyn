package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class StudentDAO {
    //public Student get(Integer id){}
    //public Student saveOrUpdate (Student student){}

    public void getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query query = session.createQuery("FROM Student");
        List<Student> studentList = (List<Student>) query.list();
        session.getTransaction().commit();
        //session.close();

        if (studentList != null && !studentList.isEmpty()) {
            for (Student st : studentList)
                System.out.println(st);
        }

        HibernateUtil.shutdown();
    }

    //public List<Student> findByNameContaining(String partOfFullName){}
}
