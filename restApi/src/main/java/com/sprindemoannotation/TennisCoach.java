package com.sprindemoannotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("thatSillyCoach")
@Scope("prototype")
public class TennisCoach implements Coach2 {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService2 fortuneService2;

    @PostConstruct
    public void doMyStartup() {
        System.out.println("start");
    }

    @PreDestroy
    public void doMyCleanup() {
        // does not call it if it's prototype
        System.out.println("destroy clean");
    }
    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService2 fortuneService2) {
        this.fortuneService2 = fortuneService2;
    }
*/
    /*
    @Autowired
    public TennisCoach(FortuneService2 fortuneService2) {
        this.fortuneService2 = fortuneService2;
    }
    */


    @Override
    public String getDailyWorkout() {
        return "practice your back end";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService2.getFortune();
    }
}
