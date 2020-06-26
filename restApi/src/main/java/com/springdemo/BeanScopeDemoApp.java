package com.springdemo;

import com.sprindemoannotation.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach2 coach = context.getBean("myCoach", Coach2.class);
        Coach2 alphaCoach = context.getBean("myCoach", Coach2.class);
        // check if these objects are the same..
        boolean ok = (coach == alphaCoach);
        System.out.println(ok);

        context.close();
    }
}
