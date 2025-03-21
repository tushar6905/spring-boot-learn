package com.tushar.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach  implements  Coach{

    public TennisCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Hi I am a Tennis Coach";
    }
}
