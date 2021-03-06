package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import com.hw30.entity.StudyGroup;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StudentDAO {
    public static List<Student> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Student");

        /*List<Student> studentList = (List<Student>) query.list();

        // just a reminder
        *//*if (studentList != null && !studentList.isEmpty()) {
            for (Student st : studentList)
                System.out.println(st);
        }*//*
        return studentList;*/

        return (List<Student>) query.list();
    }

    public Student getStudentById(Integer id) {
/**
 *      First realisation
 */
        Session session = HibernateUtil.getSessionFactory().openSession();
/*        Query query = session.createQuery("FROM Student where id =" + id);
        return (Student) query.uniqueResult();*/
        return (Student) session.get(Student.class, id);    // simplify upper query session return


/**
 *      Second realisation
 */
/*        List<Student> studentList = getAll();
        Student student = null;

        for (Student st : studentList){
            if (st.getId()==id){
                student = st;
                //System.out.println(st);
            }
        }
        return student;*/
/**
 *      here just an idea
 */
        //    idea that to take student from List of Students using stream, but I have no idea how to make it work. cast to Student doesn't work
        // even if I create Student object I don't know how to write data into it
        /*        List<Student> studentList = getAll();
         *//*                studentList.stream()
                .filter(x-> Objects.equals(x.getId(), id))
                .peek(System.out::println)
                .collect(Collectors.toList());*//*
        return null;*/
    }

    public List<Student> findByLastNameContaining(String partOfLastName) {
/**     First realisation of getting student by partOfLastName
 */
        Session session = HibernateUtil.getSessionFactory().openSession();
        String find = "'%" + partOfLastName + "%'";

        Query query = session.createQuery("FROM Student where lastName like " + find);
/*        List<Student> studentList = (List<Student>) query.list();
        return studentList;*/
        return (List<Student>) query.list();


/**     Second realisation of getting student by partOfLastName
 *          here I'm getting from List of Students and put them into new List
 */
        /*List<Student> studentList = getAll();
        List<Student> students=null;
        students = studentList.stream()
                .filter(x-> x.getLastName().contains(partOfLastName))
                //.peek(System.out::println)
                .collect(Collectors.toList());
        return students;*/

/**     Third realisation of getting student by partOfLastName
 *          here I'm streaming from List of Students
 */
/*        List<Student> studentList = getAll();
        return studentList.stream()
                .filter(x-> x.getLastName().contains(partOfLastName))
                //.peek(System.out::println)
                .collect(Collectors.toList());*/
    }

    public Student saveOrUpdate(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        if (student.getId() == null) {
            session.save(student);
            System.err.println("Record Created.");
        } else {
            session.saveOrUpdate(student);
            System.err.println("Record Updated.");
        }
        session.getTransaction().commit();
        session.close();
        return student;

/*
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            session.close();
            return student;*/

/**
 *          An IDEA how to use QUERY
 */
        // it doesn't work with trying to change study_group_id= "+ student.getStudyGroup()
        // without changing group it works
 /*           String qryString = "update Student s set s.firstName='" + student.getFirstName() + "', s.lastName='" + student.getLastName() + "', s.yearOfAdmission=" +
                    student.getYearOfAdmission() + ", study_group_id= "+ student.getStudyGroup() + " where s.id=" + student.getId();
            Query query = session.createQuery(qryString);
            int count = query.executeUpdate();
            System.err.println(count + " Record(s) Updated.");
            transaction.commit();*/

    }
}
