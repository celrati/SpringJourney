package com.springmvc.demo;

import com.springmvc.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateStudentDemo {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // save the object
            Student student = new Student("lena", "l", "mail");
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}
