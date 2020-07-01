package com.sprindemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {
    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("autoscan-applicationContext.xml");

        // retrieve bean from spring container
        Coach2 theCoach = context.getBean("thatSillyCoach", Coach2.class);

        Coach2 alphaCoach = context.getBean("thatSillyCoach", Coach2.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // close the context
        context.close();
    }
}
