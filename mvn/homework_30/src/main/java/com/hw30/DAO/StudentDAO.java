package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import org.hibernate.Session;

import java.sql.ResultSet;
import java.util.List;

public class StudentDAO {
    //public Student get(Integer id){}

    public Student ooo (Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        ResultSet rs = (ResultSet) session.createQuery("select * from student");
        session.beginTransaction();

        session.saveOrUpdate(student);
        System.out.println(rs);
        /*String fName = student.getFirstName();
        String lName = student.getLastName();

        rs = session.createQuery("SELECT a FROM Student");
        session.save(student);*/
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        return null;
    }


    //public List<Student> getAll(){}

    //public List<Student> findByNameContaining(String partOfFullName){}

}
