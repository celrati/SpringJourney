package com.sprindemoannotation;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach2 {

    private FortuneService2 fortuneService;

    @Value("${foo.email}")
    private String email;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService2 theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}