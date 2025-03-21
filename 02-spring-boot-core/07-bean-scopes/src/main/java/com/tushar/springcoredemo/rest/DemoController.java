package com.tushar.springcoredemo.rest;

import com.tushar.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach myCoach;

    @Autowired
    public void setCoach(@Qualifier("baseBallCoach") Coach theCoach){
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hlo guys";
    }

    @GetMapping("/tushar")
    public String saytushar(){
        return "Hlo tushar";
    }
}

