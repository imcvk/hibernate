package util;

import entities.Course;
import entities.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {


    public static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties p = new Properties();
            p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            p.put(Environment.URL, "jdbc:mysql://localhost/hibernate");
            p.put(Environment.USER, "root");
            p.put(Environment.PASS, "Cs@2302$");
            p.put(Environment.HBM2DDL_AUTO, "update");
            p.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            p.put(Environment.SHOW_SQL, true);
            configuration.setProperties(p).addAnnotatedClass(Student.class).addAnnotatedClass(Course.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }

        return sessionFactory;
    }
}
