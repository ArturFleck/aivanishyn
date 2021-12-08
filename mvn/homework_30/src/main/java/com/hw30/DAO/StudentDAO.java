package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import com.hw30.entity.StudyGroup;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StudentDAO {
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

    public Student getStudentById(Integer id){
        List<Student> studentList = getAll();
        Student student = null;

        for (Student st : studentList){
            if (st.getId()==id){
                student = st;
                /*System.out.println(st);*/
            }
        }

/*        studentList.stream()
                .filter(x-> Objects.equals(x.getId(), id))
                .peek(System.out::println)
                .collect(Collectors.toList());*/

        return student;
    }

    public List<Student> findByLastNameContaining(String partOfLastName){
/**     First realisation of getting student by partOfLastName
  */
        Session session = HibernateUtil.getSessionFactory().openSession();
        String find = "'%" + partOfLastName + "%'";

        Query query = session.createQuery("FROM Student where lastName like " + find);
        List<Student> studentList = (List<Student>) query.list();
        return studentList;

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

    //public Student saveOrUpdate (Student student){}
}
