package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.util.HibernateUtil;

public class MainApp {


    public static void main(String[] args) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(session);


    }
}
