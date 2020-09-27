package com.springmvc.oneoneuni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
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
            // create the objects
            Instructor instructor = new Instructor("lena1", "lena1", "email@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail("siteWeb.com1", "love coding1");
            instructor.setInstructorDetail(instructorDetail);

            // start a transaction
            session.beginTransaction();

            session.save(instructor);


            // commit the transaction
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
