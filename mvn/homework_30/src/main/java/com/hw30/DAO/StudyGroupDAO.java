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
            sg.setGroupName(studyGroup.getGroupName());
            session.saveOrUpdate(sg);
            transaction.commit();
            System.err.println( "Record Created.");
        }else{
            String qryString = "update StudyGroup s set s.groupName='" + studyGroup.getGroupName() + "' where s.id=" + studyGroup.getId();
            Query query = session.createQuery(qryString);
            query.executeUpdate();
            System.err.println("Record Updated.");
            transaction.commit();
            sg.setId(studyGroup.getId());
        }

        return sg;
    }
}
