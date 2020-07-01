package com.sprindemoannotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach2 {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService2 fortuneService2;

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
