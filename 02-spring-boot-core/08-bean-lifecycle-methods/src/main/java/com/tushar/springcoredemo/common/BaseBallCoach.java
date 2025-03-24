package com.tushar.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements  Coach{

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuffs() : " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuffs(){
        System.out.println("In doMyCleanupStuffs() : " + getClass().getSimpleName());
    }

    public  BaseBallCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override

    public String getDailyWorkout (){
        return "Spend 30 min in net practice";
    }
}
