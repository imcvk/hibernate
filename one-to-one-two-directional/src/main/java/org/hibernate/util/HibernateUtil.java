package org.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.model.Laptop_BiDirectional;
import org.hibernate.model.Student_BiDirectional;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = null;
        Properties p = new Properties();
        p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        p.put(Environment.URL, "jdbc:mysql://localhost/hibernate");
        p.put(Environment.USER, "admin");
        p.put(Environment.PASS, "password");
        p.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        p.put(Environment.HBM2DDL_AUTO, "update");
        p.put(Environment.SHOW_SQL, true);

        //create configuration
        Configuration configuration = new Configuration().setProperties(p).addAnnotatedClass(Student_BiDirectional.class).addAnnotatedClass(Laptop_BiDirectional.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        return sessionFactory;
    }
}
