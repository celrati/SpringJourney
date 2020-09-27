package com.springmvc.oneToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {
    public static void main(String[] args) {
        // create the session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create the objects
            Instructor instructor = new Instructor("Susan", "public", "susan@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail("siteWeb.com1", "love coding1");
            instructor.setInstructorDetail(instructorDetail);

            // start a transaction
            session.beginTransaction();

            session.save(instructor);


            // commit the transaction
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
