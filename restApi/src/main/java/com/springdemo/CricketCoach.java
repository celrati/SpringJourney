package com.springdemo;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    // create a no arg constructor
    public CricketCoach() {
        
    }

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice for 15 min !";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
