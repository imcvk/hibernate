package main;

import model.Answer;
import model.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Answer answer1 = new Answer();
        answer1.setAnswer("Programming language");

        Answer answer2 = new Answer();
        answer2.setAnswer("Iceland");

        List<Answer> answerList = new ArrayList<>();
        answerList.add(answer1);
        answerList.add(answer2);

        Question question=new Question();
        question.setQuestion("What is java?");
        question.setAnswers(answerList);
        answer1.setQuestion(question);
        answer2.setQuestion(question);

        session.save(answer1);
        session.save(answer2);
        session.save(question);

        transaction.commit();
        sessionFactory.close();
        session.close();
    }
}
