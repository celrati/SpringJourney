package com.springmvc.oneToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseDemo {
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

            // start a transaction
            session.beginTransaction();

            // get the instructor from the db
            int id = 1;
            Instructor instructor = session.get(Instructor.class, id);

            // create some courses
            Course courseTmp = new Course("course 1");
            Course courseTmp2 = new Course("course 2");


            // add courses to the instructor
            instructor.add(courseTmp);
            instructor.add(courseTmp2);

            // save the courses
            session.save(courseTmp);
            session.save(courseTmp2);



            // commit the transaction
            session.getTransaction().commit();

        }finally {
            session.close();
            factory.close();
        }
    }
}
