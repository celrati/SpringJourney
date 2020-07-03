package com.sprindemoannotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());

        // close the context
        context.close();

    }

}

