package com.sprindemoannotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService2 {
    @Override
    public String getFortune() {
        return "hello RAndomm";
    }
}
