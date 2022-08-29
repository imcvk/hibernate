package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eId;
    private String eName;

    @ManyToMany
    @JoinTable(
            name = "project_employee",
            joinColumns = {@JoinColumn(name = "eID")},
            inverseJoinColumns = {@JoinColumn(name = "pID")}
    )
    private List<Project> projects;

    public Employee() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void printEmpDetails() {
        String Name = geteName();
        StringBuilder projectsList = new StringBuilder();
        for (Project p : getProjects())
            projectsList.append(p.getpName()).append(",");
        System.out.println("Name:" + Name);
        System.out.println("Projects:" + projectsList.substring(0, projectsList.length() - 1));

    }
}
