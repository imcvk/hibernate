package com.hibernate.notetaker.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    @Column(length = 500000)
    private String content;
    private Date addedDate;

    public Note() {
    }

    public Note(int id, String title, String content, Date addedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.addedDate = addedDate;
    }

    public Note(String title, String content, Date addedDate) {
        this.title = title;
        this.content = content;
        this.addedDate = addedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", addedDate=" + addedDate +
                '}';
    }
}
