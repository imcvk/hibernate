package entity;




import javax.persistence.*;
import java.util.Date;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(length = 50)
    private String street;
    @Column(length = 100)
    private String city;
    private double pinCode;
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Lob
    private byte[] image;
    @Transient
    private int x;

    public Address() {
    }

    public Address(Integer id, String street, String city, double pinCode, Date date, byte[] image, int x) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
        this.date = date;
        this.image = image;
        this.x = x;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPinCode() {
        return pinCode;
    }

    public void setPinCode(double pinCode) {
        this.pinCode = pinCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
