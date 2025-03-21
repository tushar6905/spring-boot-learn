package com.tushar.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "I am your Track Coach";
    }
}
