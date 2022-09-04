package util;

import entities.Course;
import entities.Student;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class HQL_Main {
	SessionFactory sessionFactory;
	Session session;
	Transaction transaction;

	public HQL_Main() {
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
		session.persist(course1);
		session.persist(course2);
		session.persist(course3);
		session.persist(course4);

		Student student1 = new Student("Ramesh", course1), student2 = new Student("Suresh", course2),
				student3 = new Student("Ram", course3), student4 = new Student("Shyam", course4);
		session.persist(student1);
		session.persist(student2);
		session.persist(student3);
		session.persist(student4);
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
}
