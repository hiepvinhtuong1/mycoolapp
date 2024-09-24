package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice shoot for 1 hour";
    }
}
