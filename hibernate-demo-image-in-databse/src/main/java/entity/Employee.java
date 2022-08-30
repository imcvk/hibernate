package entity;


import javax.persistence.*;

@Entity
public class Employee {

    private String name;
    private String emailId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Embedded
    private Certificate certificate;
    @Embedded
    private EmployeeAddress employeeAddress;

    public Employee() {
    }

    public Employee(String name, String emailId, int id, Certificate certificate, EmployeeAddress employeeAddress) {
        this.name = name;
        this.emailId = emailId;
        this.id = id;
        this.certificate = certificate;
        this.employeeAddress = employeeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
}
