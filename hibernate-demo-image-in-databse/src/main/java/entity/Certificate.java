package entity;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String certificateId;
    private String course;

    public Certificate() {
    }

    public Certificate(String certificateId, String course) {
        this.certificateId = certificateId;
        this.course = course;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
