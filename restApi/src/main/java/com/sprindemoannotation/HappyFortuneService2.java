package com.sprindemoannotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService2 implements FortuneService2 {
    @Override
    public String getFortune() {
        return "you day is a lucky day 2";
    }
}
