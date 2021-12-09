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
        List<StudyGroup> groupList = (List<StudyGroup>) query.list();

        return groupList;
    }

    public StudyGroup getStudyGroupById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM StudyGroup where id =" + id);
        return (StudyGroup) query.uniqueResult();
    }

    public StudyGroup saveOrUpdate(StudyGroup studyGroup) {
        StudyGroup sg = getStudyGroupById(studyGroup.getId());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        if (sg == null) {
            sg= new StudyGroup();
        }
        System.out.println(sg);
        sg.setGroupName(studyGroup.getGroupName());
        session.saveOrUpdate(sg);
        transaction.commit();
        System.out.println(sg);
        return sg;
    }
}
