package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class StudentDAO {
    public Student getStudentById(Integer id){
        List<Student> students=  getAll();
        Student student = null;
        for (int i=1; i< students.size()+1;i++){
            if (students.get(i).getId()==id){

            }
        }
        return student;
    }

    //public Student saveOrUpdate (Student student){}

    public static List<Student> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("FROM Student");
        List<Student> studentList = (List<Student>) query.list();

        /*if (studentList != null && !studentList.isEmpty()) {
            for (Student st : studentList)
                System.out.println(st);
        }*/

        return studentList;
    }

    public List<Student> findByLastNameContaining(String partOfLastName){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String find = "'%" + partOfLastName + "%'";
        Query query = session.createQuery("FROM Student where lastName like " + find);
        List<Student> studentList = (List<Student>) query.list();
        return studentList;
    }
}
