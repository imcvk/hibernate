package app;

import entity.Certificate;
import entity.Employee;
import entity.EmployeeAddress;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class MainApp {


    public static void main(String[] args) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

//        //saving address object in database
//        Address address = new Address();
//        address.setCity("Solapur");
//        address.setStreet("Miraj Road");
//        address.setPinCode(413307);
//        address.setDate(new Date());
//        address.setX(0);
//        //saving image file in database.
//        FileInputStream fileInputStream = new FileInputStream("src/main/resources/test.png");
//        byte[] imgData = new byte[fileInputStream.available()];
//        fileInputStream.read(imgData);
//        address.setImage(imgData);
//        session.save(address);
//        Saving Employee data in database
        Employee employee = new Employee();
        employee.setEmailId("abc@gmail.com");
        employee.setName("abc");
        employee.setCertificate(new Certificate("Android01", "Android"));
        employee.setEmployeeAddress(new EmployeeAddress("Miraj road", "Solapur", "Maharashtra", "India", 413307L));
        session.save(employee);

//        Employee e = session.get(Employee.class, 13);
//        System.out.println(e);
//        Employee e2=session.load(Employee.class,13);
//        System.out.println(e2);

        transaction.commit();
        session.close();
        System.out.println("address pushed");
    }
}
