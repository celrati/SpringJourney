package com.springmvc.loadingEagerLazy;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {
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
            session.beginTransaction();

            // hibernate query with hql

            Query<Instructor> query = session.createQuery("select i from Instructor i " +
                    "JOIN FETCH i.courses " +
                    "where i.id=:theInstructorId", Instructor.class);


            int id = 1;
            //Instructor instructor = session.get(Instructor.class, id);


            //set parameter id
            query.setParameter("theInstructorId", id);
            Instructor instructor = query.getSingleResult();

            // start a transaction
            // System.out.println("hello " + instructor.getCourses());
            //session.save(instructor);


            // commit the transaction
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
