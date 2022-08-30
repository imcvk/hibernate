package org.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * method to save,delete,update and fetch data from database table using hibernate
 */
public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory;
        /**
         * Fetching SessionFactory object by using java based configuration
         * */
        //sessionFactory = HibernateUtil.getSessionFactoryUsingJava_based_Configuration();
        /**
         * Fetching SessionFactory object by using XML based configuration
         * */
        sessionFactory = HibernateUtil.getSessionFactoryUsingJava_based_Configuration_Using_Properties();
        /**
         *
         * */
        sessionFactory = HibernateUtil.getSessionFactoryUsingJava_based_Configuration();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        //student.setId(1993);
        student.setRollNo(10);
        student.setName("Chaitanya");
        student.setEmailId("imcvk@gmail.com");

        session.save(student);
        System.out.println("Student added");
        // session.delete(student);
        //System.out.println("Student deleted.");
        //session.saveOrUpdate(student);
        Student s = session.get(Student.class, student.getId());
        System.out.println(s);
        transaction.commit();

        session.close();
    }
}

