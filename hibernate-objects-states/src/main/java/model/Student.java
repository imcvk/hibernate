package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String studentName;
    private String studentCity;

    @OneToMany
    private List<Certificate> certificates;

    /* @OneToOne//(cascade = CascadeType.ALL)
    private Certificate certificate;
    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
*/
    public Student() {
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public void printDetails() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("ID:" + getStudentId());
        System.out.println("Name:" + getStudentName());
        System.out.println("City:" + getStudentCity());
        System.out.println("Certificates:");
        for (Certificate c : getCertificates()) {
            System.out.println(c.getCertificateName());
        }
        System.out.println("------------------------------------------------------------------------------");
    }
}
