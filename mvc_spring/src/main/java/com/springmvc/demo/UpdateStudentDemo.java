package com.springmvc.demo;

import com.springmvc.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class UpdateStudentDemo {
    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            Student studentToRead = session.get(Student.class, 1);
            studentToRead.setFirstName("ohayoNewName");

            session.getTransaction().commit();




        }finally {
            factory.close();
        }
    }
}
