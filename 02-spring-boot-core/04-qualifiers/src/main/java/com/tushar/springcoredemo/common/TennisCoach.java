package com.tushar.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach  implements  Coach{
    @Override
    public String getDailyWorkout(){
        return "Hi I am a Tennis Coach";
    }
}
