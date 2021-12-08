package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StudentDAO {
    public Student getStudentById(Integer id){
        List<Student> studentList =  getAll();
        Student student = null;

        for (Student st : studentList){
            if (st.getId()==id){
                student = st;
            }
            //System.out.println(st);
        }

        /*studentList.stream()
                .filter(x->x.getId()==id )
                .peek(System.out::println)
                .collect(Collectors.toList());*/

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
