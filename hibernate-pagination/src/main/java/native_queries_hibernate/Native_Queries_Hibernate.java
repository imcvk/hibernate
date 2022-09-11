package native_queries_hibernate;

import hql_crud_operations.entities.Student;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import util.HibernateUtil;

import java.util.List;

public class Native_Queries_Hibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String q = "select * from Student";
        NativeQuery<Student> nativeQuery = session.createNativeQuery(q, Student.class);
        List<Student> list = nativeQuery.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }
}
