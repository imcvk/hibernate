package main;

import model.Certificate;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
/**
 * creating objects to push - in TRANSIENT STATE
 **/
        Student student = new Student();
        student.setStudentName("Rohit");
        student.setStudentCity("Pune");
        Certificate certificate1 = new Certificate();
        certificate1.setCertificateName("Java");
        Certificate certificate2 = new Certificate();
        certificate2.setCertificateName("Python");
        List<Certificate> certificateList = new ArrayList<>(Arrays.asList(certificate1, certificate2));

        student.setCertificates(certificateList);
        certificate1.setStudent(student);
        certificate2.setStudent(student);
/**
 * Student will be in PERSISTENT state after above statements
 * */
        session.save(certificate1);
        session.save(certificate2);
        session.save(student);
        student.printDetails();
/**
 * Before closing SessionFactory and Committing transaction Object will be in PERSISTENT state.
 * i.e. associate with Session and Database as well.
 * */
        student.setStudentName("Virat");
        student.printDetails();
        session.save(student);

        transaction.commit();
        sessionFactory.close();
    }
}
