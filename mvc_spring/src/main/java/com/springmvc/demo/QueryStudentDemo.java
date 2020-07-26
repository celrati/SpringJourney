package com.springmvc.demo;

import com.springmvc.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class QueryStudentDemo {
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

            List<Student> students = session.createQuery("from Student").getResultList();

            for(Student st: students) {
                System.out.println(st);
            }


            students = session.createQuery("from Student s where s.firstName = 'achraf' ").getResultList();
            System.out.println("---###---");
            for(Student st: students) {
                System.out.println(st);
            }

            session.getTransaction().commit();




        }finally {
            factory.close();
        }
    }
}
