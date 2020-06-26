package com.springdemo;

import com.sprindemoannotation.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach2 coach = context.getBean("myCoach", Coach2.class);

        context.close();
    }
}
