package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String question;

    @OneToMany(mappedBy = "question")
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

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
