package com.hw30.DAO;

import com.hw30.HibernateUtil;
import com.hw30.entity.StudyGroup;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class StudyGroupDAO {
/*    public StudyGroup get(Integer id) {
    }*/

    public void getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query query = session.createQuery("FROM StudyGroup");
        List<StudyGroup> groupList = (List<StudyGroup>) query.list();
        session.getTransaction().commit();
        //session.close();

        if (groupList != null && !groupList.isEmpty()) {
            for (StudyGroup sg : groupList)
                System.out.println(sg);
        }

        HibernateUtil.shutdown();
    }

/*    public StudyGroup saveOrUpdate(StudyGroup studyGroup) {
    }*/

}
