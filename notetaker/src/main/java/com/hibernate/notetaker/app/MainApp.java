package com.hibernate.notetaker.app;

import com.hibernate.notetaker.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MainApp {


    public static void main(String[] args) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(session);


    }
}
