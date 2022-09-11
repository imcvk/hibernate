package hql_crud_operations.hql_operations;

import hql_crud_operations.entities.Course;
import hql_crud_operations.entities.Student;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class HqlCrudOperations {
    SessionFactory sessionFactory;
    Session session;
    Transaction transaction;

    public HqlCrudOperations() {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    /**
     * Insert data into table using hibernate
     */
    public void insertRecords() {

        Course course1 = new Course("Java programming language"), course2 = new Course("Python programing language"),
                course3 = new Course("C programing language"), course4 = new Course("C++ programing language");
        session.persist(course1);
        session.persist(course2);
        session.persist(course3);
        session.persist(course4);

        Student student1 = new Student("Ramesh1", "Pune", "MH", "India", course1),
                student2 = new Student("Suresh1", "Mumbai", "MH", "India", course2),
                student3 = new Student("Ram1", "Chennai", "TN", "India", course3),
                student4 = new Student("Shyam1", "Kochin", "KR", "India", course4);
        session.persist(student1);
        session.persist(student2);
        session.persist(student3);
        session.persist(student4);
        transaction.commit();

    }

    /**
     * Fetch data from tables without any condition using hibernate HQL
     */

    public void fetchAllStudents() {
        String query = "from Student";
        Query query1 = session.createQuery(query);
        List<Student> list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    /**
     * fetch record using alias
     */
    public void fetchUnique() {
        String query = "from Student as s where s.studName=:x";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Ram");
        List<Student> list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    /**
     * fetch records using AND in WHERE clause
     */
    public void fetchWithAND_clause() {
        String query = "from Student as s where s.studName=:x and s.studId=:y";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Ramesh");
        query1.setParameter("y", "1");
        List<Student> list = new ArrayList<Student>();

        list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    /**
     * fetch using OR clause
     */
    public void fetchUsing_OR_clause() {
        String query = "from Student s where s.studName=:x or s.studName=:y";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Ram");
        query1.setParameter("y", "Shyam");
        List<Student> list = new ArrayList<Student>();

        list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    public void deleteUsingHQL() {
        transaction.begin();
        String query = "delete from Student s where s.studName=:x";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Suresh");
        int deleteCount = query1.executeUpdate();
        transaction.commit();
        System.out.println("Record Deleted: " + deleteCount);
    }

    public void updateUser() {

        String query = "update Student s set s.studName=:name where s.studId=:id";
        Query query1 = session.createQuery(query);
        query1.setParameter("name", "Rohan");
        query1.setParameter("id", "152");
        int result = query1.executeUpdate();
        transaction.commit();
        System.out.println("Number of rows updated: " + result);
    }

//    public void hqlJoin() {
//        String query = "select s.studId,s.studName,c.courseId from Student as s inner join s.course as c";
//        Query query1 = session.createQuery(query);
//        List<Student> list = query1.getResultList();
//        for (Student s : list) {
//            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
//        }
//    }

    /**
     * Pagination example for hibernate
     */
    public void hqlPagination() {
        Query query1 = session.createQuery("from Student");
        query1.setFirstResult(0);
        query1.setMaxResults(5);
        List<Student> list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }
}
