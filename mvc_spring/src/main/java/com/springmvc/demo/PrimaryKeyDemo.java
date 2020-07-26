package com.springmvc.demo;

import com.springmvc.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // save the object

            Student student = new Student("s1", "l", "mail");
            Student student1 = new Student("s2", "l", "mail");
            Student student2 = new Student("s3", "l", "mail");

            session.beginTransaction();
            session.save(student);
            session.save(student1);
            session.save(student2);
            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
