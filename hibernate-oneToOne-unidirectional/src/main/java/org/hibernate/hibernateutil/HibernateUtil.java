package org.hibernate.hibernateutil;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.model.Laptop;
import org.hibernate.model.Student;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = null;
        if (sessionFactory == null) {
            Properties p = new Properties();
            p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            p.put(Environment.URL, "jdbc:mysql://localhost/hibernate");
            p.put(Environment.USER, "root");
            p.put(Environment.PASS, "root");
            p.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            p.put(Environment.HBM2DDL_AUTO, "update");
            p.put(Environment.SHOW_SQL, true);

            //create configuration
            Configuration configuration = new Configuration().setProperties(p);
            configuration.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        }
        return sessionFactory;
    }
}
