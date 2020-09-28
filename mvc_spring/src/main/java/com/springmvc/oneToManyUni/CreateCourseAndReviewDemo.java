package com.springmvc.oneToManyUni;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndReviewDemo {
    public static void main(String[] args) {
        // create the session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            Course course = new Course("pacman");
            course.addReview(new Review("good game"));
            course.addReview(new Review("liked the game !"));

            // commit the transaction
            session.save(course);
            session.getTransaction().commit();

        }finally {
            session.close();
            factory.close();
        }
    }
}
