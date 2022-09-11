package hibernate_cascading_demo.mainapp;

import hibernate_cascading_demo.entities.Question;
import hibernate_cascading_demo.entities.Answer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Answer a1 = new Answer();
        a1.setAnswer("Programming language");
        Answer a2 = new Answer();
        a2.setAnswer("Serpent");
        List<Answer> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);

        Question question = new Question();
        question.setQuestion("What is Python");
        question.setAnswerList(list);
        a1.setQuestion(question);
        a2.setQuestion(question);


        session.persist(question);
        /**
         * we have to save answers individually to avoid this. we have to use CASCADING in hibernate
         * */
//        session.persist(a1);
//        session.persist(a2);
        transaction.commit();
    }
}
