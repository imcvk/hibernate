package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String question;

    @OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
    private List<Answer> answers;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

/**
 *By default, its lazy loading
 * */
    public void printDetails() {
        int id = getId();
        String question = getQuestion();
        List<Answer> answers = getAnswers();

        System.out.println("Id: " + id + "\nQuestion:" + question +
                "\nAnswers:");
        for (Answer a : answers)
            System.out.println(a.getAnswer());

    }
}
