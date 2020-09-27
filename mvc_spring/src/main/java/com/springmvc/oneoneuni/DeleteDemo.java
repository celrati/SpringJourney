package com.springmvc.oneoneuni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
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
            Instructor instructor = session.get(Instructor.class, id);

            if( instructor != null ){
                // will also delete the detail
                // because its cascade attached
                session.delete(instructor);
            }

            

            // commit the transaction
            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
