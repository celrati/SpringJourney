package com.sprindemoannotation;


import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach2 {
    @Override
    public String getDailyWorkout() {
        return "practice your back end";
    }
}
