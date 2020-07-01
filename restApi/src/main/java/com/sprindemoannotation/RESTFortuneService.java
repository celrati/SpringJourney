package com.sprindemoannotation;


import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService2 {
    @Override
    public String getFortune() {
        return null;
    }
}
