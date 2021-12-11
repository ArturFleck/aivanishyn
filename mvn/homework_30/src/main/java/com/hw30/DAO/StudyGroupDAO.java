package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.Student;
import com.hw30.entity.StudyGroup;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudyGroupDAO {

    public List<StudyGroup> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Query query = session.createQuery("FROM StudyGroup");
 /*       List<StudyGroup> groupList = (List<StudyGroup>) query.list();
        return groupList;*/
        return (List<StudyGroup>) query.list();
    }

    public StudyGroup getStudyGroupById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        /*Query query = session.createQuery("FROM StudyGroup where id =" + id);
        return (StudyGroup) query.uniqueResult();*/
        return (StudyGroup) session.get(StudyGroup.class, id);  // simplify upper query session return
    }

    public StudyGroup saveOrUpdate(StudyGroup studyGroup) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        if (getStudyGroupById(studyGroup.getId()) == null) {
            session.save(studyGroup);
            System.err.println( "Record Created.");
        }else{
            session.saveOrUpdate(studyGroup);
            System.err.println("Record Updated.");
        }
        session.getTransaction().commit();
        session.close();
        //---------------------------------------------
        /*Session session  = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(studyGroup);
            session.getTransaction().commit();
        }finally {
            if (session != null) {
                session.close();
            }
        }*/

        return studyGroup;
    }
}
