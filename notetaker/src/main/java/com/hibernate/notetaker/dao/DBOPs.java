package com.hibernate.notetaker.dao;

import com.hibernate.notetaker.entities.Note;
import com.hibernate.notetaker.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBOPs {
    private Session session;
    Transaction transaction;

    public void save(Note note) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.persist(note);
        transaction.commit();
        //session.close();
    }

    public List<Note> getAllNotes() {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("from Note");
        List<Note> noteList = query.getResultList();
        return noteList;
    }

    public void deleteNote(Note note, Session session) {
        transaction = session.beginTransaction();
        session.remove(note);
        transaction.commit();
    }

    public void updateNote(Note note, Session session) {
        transaction = session.beginTransaction();
        session.saveOrUpdate(note);
        transaction.commit();

    }
}
