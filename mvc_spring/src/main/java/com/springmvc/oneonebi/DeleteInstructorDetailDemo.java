package com.springmvc.oneonebi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {
    public static void main(String[] args) {
        // create the session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // start a transaction
            session.beginTransaction();

            int id = 1;
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);
            System.out.println("aloha");
            System.out.println(instructorDetail);
            System.out.println(instructorDetail.getInstructor());

            session.delete(instructorDetail);

            // commit the transaction
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
