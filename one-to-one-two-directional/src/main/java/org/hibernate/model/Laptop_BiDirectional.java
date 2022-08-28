package org.hibernate.model;

import jakarta.persistence.*;

@Entity
public class Laptop_BiDirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int laptop_id;
    private String laptop_name;

    //@OneToOne(targetEntity = Student_BiDirectional.class, cascade = CascadeType.ALL)
    //@OneToOne
    @OneToOne
    private Student_BiDirectional student;

    public Student_BiDirectional getStudent() {
        return student;
    }

    public void setStudent(Student_BiDirectional student) {
        this.student = student;
    }

    public Laptop_BiDirectional() {
    }

    public int getId() {
        return laptop_id;
    }

    public void setId(int id) {
        this.laptop_id = id;
    }

    public String getLaptopName() {
        return laptop_name;
    }

    public void setLaptopName(String laptopName) {
        this.laptop_name = laptopName;
    }
}
