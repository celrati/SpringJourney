package com.springdemo;

public class TrackCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a contructor for dependency injection
    TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
