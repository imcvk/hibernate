package org.hibernate.mainapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.model.Laptop_BiDirectional;
import org.hibernate.model.Student_BiDirectional;
import org.hibernate.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Laptop_BiDirectional l1 = new Laptop_BiDirectional();
        l1.setLaptopName("DELL");

        Student_BiDirectional student = new Student_BiDirectional();
        student.setName("Sachin");
        student.setLaptop(l1);
        l1.setStudent(student);

        session.save(student);
        transaction.commit();
        sessionFactory.close();
        session.close();
    }
}