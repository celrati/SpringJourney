package com.sprindemoannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService2 sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach2 swimCoach() {
        SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());

        return mySwimCoach;
    }

}







