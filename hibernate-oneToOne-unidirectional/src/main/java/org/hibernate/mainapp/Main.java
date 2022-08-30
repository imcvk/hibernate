package org.hibernate.mainapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.hibernateutil.HibernateUtil;
import org.hibernate.model.Laptop;
import org.hibernate.model.Student;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Laptop l1 = new Laptop();
        l1.setLaptopName("DELL");
        Student student = new Student();
        student.setName("Sachin");
        student.setLaptop(l1);
        session.save(student);

        transaction.commit();
        sessionFactory.close();
        session.close();
    }
}