package com.sprindemoannotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService2 {
    @Override
    public String getFortune() {
        return null;
    }
}
