package com.tushar.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return  "Practice bowling for 15 min on daily basis as fast as u can" ;
    }
}

