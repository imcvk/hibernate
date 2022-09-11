package util;

import entities.Course;
import entities.Student;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class HQL_Operations {
    SessionFactory sessionFactory;
    Session session;
    Transaction transaction;

    public HQL_Operations() {
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    /**
     * Insert data into table using hibernate
     */
    public void insertRecords() {

        Course course1 = new Course("Java programming language"), course2 = new Course("Python programing language"),
                course3 = new Course("C programing language"), course4 = new Course("C++ programing language");
//        session.persist(course1);
//        session.persist(course2);
//        session.persist(course3);
//        session.persist(course4);
//
//        Student student1 = new Student("Ramesh", course1), student2 = new Student("Suresh", course2),
//                student3 = new Student("Ram", course3), student4 = new Student("Shyam", course4);
//        session.persist(student1);
//        session.persist(student2);
//        session.persist(student3);
//        session.persist(student4);

   session.persist(new Student("James Walker“,course1));
session.persist(new Student("Velma Clemons“,course1));
session.persist(new Student("Kibo Underwood“,course1));
session.persist(new Student("Louis Mcgee“,course1));
session.persist(new Student("Phyllis Paul“,course1));
session.persist(new Student("Zenaida Decker“,course1));
session.persist(new Student("Gillian Tillman“,course1));
session.persist(new Student("Constance Boone“,course1));
session.persist(new Student("Giselle Lancaster“,course1));
session.persist(new Student("Kirsten Mcdowell“,course1));
session.persist(new Student("Solomon Ray“,course1));
session.persist(new Student("John Marshall“,course1));
session.persist(new Student("Merrill Carney“,course1));
session.persist(new Student("Hakeem Gillespie“,course1));
session.persist(new Student("Hayden Boyer“,course1));
session.persist(new Student("Griffin Mcleod“,course1));
session.persist(new Student("Allistair Patton“,course1));
session.persist(new Student("Rina Slater“,course1));
session.persist(new Student("Caldwell Skinner“,course1));
session.persist(new Student("Portia Galloway“,course1));
session.persist(new Student("Noelle Valentine“,course1));
session.persist(new Student("Abel Clay“,course1));
session.persist(new Student("Stephanie Kent“,course1));
session.persist(new Student("Axel Petty“,course1));
session.persist(new Student("Nevada Morales“,course1));
session.persist(new Student("Fuller Bush“,course1));
session.persist(new Student("Quinn Mayo“,course1));
session.persist(new Student("Marcia Shepard“,course1));
session.persist(new Student("Kieran Moody“,course1));
session.persist(new Student("Brielle Thompson“,course1));
session.persist(new Student("Hashim Gay“,course1));
session.persist(new Student("Deborah Roberts“,course1));
session.persist(new Student("Nomlanga Clarke“,course1));
session.persist(new Student("Elaine Downs“,course1));
session.persist(new Student("Christen Ballard“,course1));
session.persist(new Student("Dacey Baxter“,course1));
session.persist(new Student("Nasim Sampson“,course1));
session.persist(new Student("Yoshi Sherman“,course1));
session.persist(new Student("Veda Malone“,course1));
session.persist(new Student("Scarlett Fisher“,course1));
session.persist(new Student("Meredith Parsons“,course1));
session.persist(new Student("Jerome Buckley“,course3));
session.persist(new Student("Jacob Foreman“,course3));
session.persist(new Student("Gisela Robertson“,course3));
session.persist(new Student("Sylvia Kent“,course3));
session.persist(new Student("Mercedes King“,course3));
session.persist(new Student("Logan Madden“,course3));
session.persist(new Student("Ryan Herman“,course3));
session.persist(new Student("Cora Frazier“,course3));
session.persist(new Student("Yolanda Carter“,course3));
session.persist(new Student("Hadassah Lowe“,course3));
session.persist(new Student("Ingrid Yang“,course3));
session.persist(new Student("Trevor Spence“,course3));
session.persist(new Student("Iola West“,course3));
session.persist(new Student("Kitra Sparks“,course3));
session.persist(new Student("Carly Bray“,course3));
session.persist(new Student("Leilani Beard“,course3));
session.persist(new Student("Cameron Bowen“,course3));
session.persist(new Student("Hilda Oneill“,course3));
session.persist(new Student("Ori Short“,course3));
session.persist(new Student("Xandra Cardenas“,course3));
session.persist(new Student("Audrey Todd“,course3));
session.persist(new Student("Ferdinand Lloyd“,course3));
session.persist(new Student("Kareem Mcdowell“,course3));
session.persist(new Student("Aaron Giles“,course3));
session.persist(new Student("Keefe Schneider“,course3));
session.persist(new Student("Kasper Ballard“,course3));
session.persist(new Student("Maris Turner“,course3));
session.persist(new Student("Ava Robertson“,course3));
session.persist(new Student("Gillian Benton“,course3));
session.persist(new Student("Dora Landry“,course3));
session.persist(new Student("Aimee Eaton“,course3));
session.persist(new Student("Iola Sutton“,course3));
session.persist(new Student("Jana Reed“,course3));
session.persist(new Student("Alfonso Love“,course3));
session.persist(new Student("Ciaran Mosley“,course3));
session.persist(new Student("Justin Evans“,course3));
session.persist(new Student("Ryder Combs“,course3));
session.persist(new Student("Nelle Skinner“,course3));
session.persist(new Student("Jakeem Rivera“,course3));
session.persist(new Student("Hyatt Long“,course3));
session.persist(new Student("Tanisha Stanton“,course3));
session.persist(new Student("Alec Pittman“,course3));
session.persist(new Student("Octavia Ashley“,course3));
session.persist(new Student("Curran Merrill“,course3));
session.persist(new Student("Laith Gibbs“,course4));
session.persist(new Student("Walter Skinner“,course4));
session.persist(new Student("Burke Horn“,course4));
session.persist(new Student("Alexander Walton“,course4));
session.persist(new Student("Cally Wilkinson“,course4));
session.persist(new Student("Gary Mcintosh“,course4));
session.persist(new Student("Jacob Greer“,course4));
session.persist(new Student("Fitzgerald Mueller“,course4));
session.persist(new Student("Claire Roberts“,course4));
session.persist(new Student("Kuame Harrell“,course4));
session.persist(new Student("Kaseem Hurst“,course4));
session.persist(new Student("Irene Witt“,course4));
session.persist(new Student("Courtney Nash“,course4));
session.persist(new Student("Lane Torres“,course4));
session.persist(new Student("Jonas Vinson“,course4));
session.persist(new Student("Burton Holden“,course4));
session.persist(new Student("Connor Shaw“,course4));
session.persist(new Student("Calvin Riddle“,course4));
session.persist(new Student("Tara Mendez“,course4));
session.persist(new Student("Myra Wall“,course4));
session.persist(new Student("Pandora Orr“,course4));
session.persist(new Student("Stuart Crawford“,course4));
session.persist(new Student("Winter Mendez“,course4));
session.persist(new Student("Elijah Goff“,course4));
session.persist(new Student("Chiquita Gilmore“,course4));
session.persist(new Student("Eleanor Gregory“,course4));
session.persist(new Student("Justine Soto“,course4));
session.persist(new Student("Stuart Mcdaniel“,course4));
session.persist(new Student("Shaeleigh Dunlap“,course4));
session.persist(new Student("Lesley Bolton“,course4));
session.persist(new Student("Shellie Davis“,course4));
session.persist(new Student("Tarik Jarvis“,course4));
session.persist(new Student("Adria Ball“,course4));
session.persist(new Student("Daryl Tillman“,course4));
session.persist(new Student("Magee Tate“,course4));
session.persist(new Student("Jordan Beasley“,course4));
session.persist(new Student("Dalton Becker“,course4));
session.persist(new Student("Derek Burnett“,course4));
session.persist(new Student("Halla Little“,course4));
session.persist(new Student("Lani Pate“,course4));
session.persist(new Student("Moses Chang“,course4));
session.persist(new Student("Travis Weeks“,course4));
session.persist(new Student("Nichole Ortega“,course4));
session.persist(new Student("Hasad Berger“,course4));
session.persist(new Student("Galvin Hall“,course4));
session.persist(new Student("Kieran English“,course4));
session.persist(new Student("Ella Dunn“,course4));
session.persist(new Student("Jermaine Roman“,course4));
session.persist(new Student("Chadwick Armstrong“,course4));
session.persist(new Student("Rhonda Ellis“,course4));
session.persist(new Student("Ezra Brooks“,course4));
session.persist(new Student("Jessamine Trevino“,course4));
session.persist(new Student("Chaim Garrison“,course4));
session.persist(new Student("Bo Leonard“,course4));
session.persist(new Student("May Christian“,course4));
session.persist(new Student("Ashton Nicholson“,course4));
session.persist(new Student("Solomon Rollins“,course4));
session.persist(new Student("Wesley Jacobson“,course4));
session.persist(new Student("Laura Gomez“,course4));
session.persist(new Student("Cora Fuentes“,course4));
session.persist(new Student("Deirdre Flowers“,course4));
session.persist(new Student("Yen Rutledge“,course4));
session.persist(new Student("Vladimir Delgado“,course4));
session.persist(new Student("Hedley Brewer“,course4));
session.persist(new Student("Lillian Massey“,course4));
session.persist(new Student("MacKensie Lopez“,course4));
session.persist(new Student("Raja Conley“,course4));
session.persist(new Student("Xavier Coffey“,course4));
session.persist(new Student("Ian Sawyer“,course4));
session.persist(new Student("Branden Hansen“,course4));
session.persist(new Student("Yoshio Schultz“,course4));
session.persist(new Student("Jamal Mercado“,course4));
session.persist(new Student("Ishmael Zamora“,course4));
session.persist(new Student("Kristen Potter“,course4));
session.persist(new Student("Unity Rodriquez“,course4));
session.persist(new Student("Mia Barry“,course4));
session.persist(new Student("Vincent Byers“,course4));
session.persist(new Student("Rogan Edwards“,course4));
session.persist(new Student("Darrel Wallace“,course4));
session.persist(new Student("Colin Adkins“,course4));
session.persist(new Student("Hop Cantu“,course4));
session.persist(new Student("Nita Valdez“,course4));
session.persist(new Student("Georgia Gomez“,course4));
session.persist(new Student("Shannon Fields“,course4));
session.persist(new Student("Jennifer Keith“,course4));
session.persist(new Student("Keane Cox“,course4));
session.persist(new Student("Sage Foster“,course4));
session.persist(new Student("Ezra Hoover“,course4));
session.persist(new Student("Burton Burke“,course4));
session.persist(new Student("Preston Barrera“,course4));
session.persist(new Student("Octavia Monroe“,course4));
session.persist(new Student("Kirestin Sweet“,course4));
session.persist(new Student("Octavius Chambers“,course4));
session.persist(new Student("Grady Decker“,course4));
session.persist(new Student("Jenette Humphrey“,course4));
session.persist(new Student("Hayley Hull“,course2));
session.persist(new Student("Mohammad Cantrell“,course2));
session.persist(new Student("Alma Richmond“,course2));
session.persist(new Student("Galena Mayer“,course2));
session.persist(new Student("Reese Black“,course2));
session.persist(new Student("Phillip Ward“,course2));
session.persist(new Student("Priscilla Higgins“,course2));
session.persist(new Student("Yael Trujillo“,course2));
session.persist(new Student("Demetrius Castaneda“,course2));
session.persist(new Student("Todd Dillard“,course2));
session.persist(new Student("Noelle Marsh“,course2));
session.persist(new Student("Akeem Chan“,course2));
session.persist(new Student("Victoria Long“,course2));
session.persist(new Student("Brooke Zimmerman“,course2));
session.persist(new Student("Cadman Greene“,course2));
session.persist(new Student("Yen Bowers“,course2));
session.persist(new Student("Ryan Pena“,course2));
session.persist(new Student("Portia Hamilton“,course2));
session.persist(new Student("Sydnee Chambers“,course2));
session.persist(new Student("Stacy Small“,course2));

        transaction.commit();

    }

    /**
     * Fetch data from tables without any condition using hibernate HQL
     */

    public void fetchAllStudents() {
        String query = "from Student";
        Query query1 = session.createQuery(query);
        List<Student> list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    /**
     * fetch record using alias
     */
    public void fetchUnique() {
        String query = "from Student as s where s.studName=:x";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Ram");
        List<Student> list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    /**
     * fetch records using AND in WHERE clause
     */
    public void fetchWithAND_clause() {
        String query = "from Student as s where s.studName=:x and s.studId=:y";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Ramesh");
        query1.setParameter("y", "1");
        List<Student> list = new ArrayList<Student>();

        list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    /**
     * fetch using OR clause
     */
    public void fetchUsing_OR_clause() {
        String query = "from Student s where s.studName=:x or s.studName=:y";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Ram");
        query1.setParameter("y", "Shyam");
        List<Student> list = new ArrayList<Student>();

        list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    public void deleteUsingHQL() {
        transaction.begin();
        String query = "delete from Student s where s.studName=:x";
        Query query1 = session.createQuery(query);
        query1.setParameter("x", "Suresh");
        int deleteCount = query1.executeUpdate();
        transaction.commit();
        System.out.println("Record Deleted: " + deleteCount);
    }

    public void updateUser() {

        String query = "update Student s set s.studName=:name where s.studId=:id";
        Query query1 = session.createQuery(query);
        query1.setParameter("name", "Rohan");
        query1.setParameter("id", "152");
        int result = query1.executeUpdate();
        transaction.commit();
        System.out.println("Number of rows updated: " + result);
    }

    public void hqlJoin() {
        String query = "select s.studId,s.studName,c.courseId from Student as s inner join s.course as c";
        Query query1 = session.createQuery(query);
        List<Student> list = query1.getResultList();
        for (Student s : list) {
            System.out.println(" | " + s.getStudId() + " | " + s.getStudName() + " | " + s.getCourse() + " |");
        }
    }

    public void closeChannels() {
        //session.close();
        sessionFactory.close();
    }
}
