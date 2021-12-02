package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import org.hibernate.Session;

import java.util.List;

public class StudentDAO {
    //public Student get(Integer id){}

    public Student saveOrUpdate (Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        String fName = student.getFirstName();
        String lName = student.getLastName();



        session.save(student);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        return null;
    }

    //public List<Student> getAll(){}

    //public List<Student> findByNameContaining(String partOfFullName){}

}
