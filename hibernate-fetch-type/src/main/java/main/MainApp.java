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
/*

        //Answers for the questions
        Answer answer1 = new Answer();
        answer1.setAnswer("Programming language");
        Answer answer2 = new Answer();
        answer2.setAnswer("Iceland");
        Answer answer3 = new Answer();
        answer3.setAnswer("Serpent");
        Answer answer4 = new Answer();
        answer4.setAnswer("Programming language");
//creating list of answers for question
        List<Answer> answerList = new ArrayList<>();
        answerList.add(answer1);
        answerList.add(answer2);
//creating question and setting answer for it
        Question question = new Question();
        question.setQuestion("What is java?");
        question.setAnswers(answerList);
        answer1.setQuestion(question);
        answer2.setQuestion(question);
//saving answer and related question
        session.save(answer1);
        session.save(answer2);
        session.save(question);
//creating list of answers for question1
        List<Answer> answerList1 = new ArrayList<>();
        answerList1.add(answer4);
        answerList1.add(answer3);
//creating question and setting answer for it
        Question question1 = new Question();
        question1.setQuestion("What is Python?");
        question1.setAnswers(answerList1);
        answer3.setQuestion(question1);
        answer4.setQuestion(question1);
//saving answer and related question
        session.save(answer4);
        session.save(answer3);
        session.save(question1);


*/

        Question question = (Question) session.get(Question.class, 1);
        /*
         By default, its lazy loading
         data will not be fetched unless it is used.
          */
        question.printDetails();
        Answer answer = session.get(Answer.class, 2);
        answer.printDetails();
        transaction.commit();
        sessionFactory.close();
        session.close();
    }
}

