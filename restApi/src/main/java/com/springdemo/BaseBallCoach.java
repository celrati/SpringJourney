package com.springdemo;

import com.sprindemoannotation.Coach2;

public class BaseBallCoach implements Coach {



    @Override
    public String getDailyWorkout() {
        return "I spent 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune service to get the fortune
        return null;
    }
}
