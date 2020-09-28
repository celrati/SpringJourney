package com.springmvc.oneToManyUni;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class deleteCourseAndReviewDemo {
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
            session.beginTransaction();

            int id = 10;
            Course course = session.get(Course.class, id);
            System.out.println(course);
            System.out.println(course.getReviews());

            session.delete(course);
            // commit the transaction
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
