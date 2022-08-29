package main;

import model.Employee;
import model.Project;
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


        Employee e1 = new Employee(), e2 = new Employee(), e3 = new Employee();
//        e1.seteName("Bharat");
//        e2.seteName("Lakshman");
//        e3.seteName("Ram");

//        Project p1 = new Project(), p2 = new Project(), p3 = new Project();
//        p1.setpName("SQL");
//        p2.setpName("Java");
//        p3.setpName("Python");

//        p1.setEmployees(new ArrayList<>(Arrays.asList(e1, e2)));
//        p2.setEmployees(new ArrayList<>(Arrays.asList(e1, e2, e3)));
//        p3.setEmployees(new ArrayList<>(Arrays.asList(e1, e3)));
//
//
//        e1.setProjects(new ArrayList<>(Arrays.asList(p1, p2, p3)));
//        e2.setProjects(new ArrayList<>(Arrays.asList(p1, p2)));
//        e3.setProjects(new ArrayList<>(Arrays.asList(p1, p3)));
//        session.save(e1);
//        session.save(e2);
//        session.save(e3);
//
//        session.save(p1);
//        session.save(p2);
//        session.save(p3);

        e1 = session.get(Employee.class, 1);
        e1.printEmpDetails();
        e1 = session.get(Employee.class, 2);
        e1.printEmpDetails();
        e1 = session.get(Employee.class, 3);
        e1.printEmpDetails();

        transaction.commit();
        sessionFactory.close();
        session.close();
    }
}
