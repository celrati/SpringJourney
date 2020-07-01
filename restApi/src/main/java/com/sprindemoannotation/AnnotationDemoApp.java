package com.sprindemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("autoscan-applicationContext.xml");
        Coach2 coach = context.getBean("thatSillyCoach", Coach2.class);
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
