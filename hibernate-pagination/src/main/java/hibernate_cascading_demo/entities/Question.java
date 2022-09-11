package hibernate_cascading_demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int question_id;
    private String question;

    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    private List<Answer> answerList;

    public Question() {
    }

    public Question(int question_id, String question, List<Answer> answerList) {
        this.question_id = question_id;
        this.question = question;
        this.answerList = answerList;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
