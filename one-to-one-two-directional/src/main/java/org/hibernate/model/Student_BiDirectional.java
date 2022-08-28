package org.hibernate.model;

import jakarta.persistence.*;

@Entity
public class Student_BiDirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String student_name;

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop_BiDirectional laptopBiDirectional;

    public Student_BiDirectional() {
    }

    public Laptop_BiDirectional getLaptop() {
        return laptopBiDirectional;
    }

    public void setLaptop(Laptop_BiDirectional laptopBiDirectional) {
        this.laptopBiDirectional = laptopBiDirectional;
    }

    public int getId() {
        return student_id;
    }

    public void setId(int id) {
        this.student_id = id;
    }

    public String getName() {
        return student_name;
    }

    public void setName(String name) {
        this.student_name = name;
    }
}
