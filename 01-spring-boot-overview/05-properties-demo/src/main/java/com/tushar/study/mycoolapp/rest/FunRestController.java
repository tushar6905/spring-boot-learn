package com.tushar.study.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    public String coachName;

    @Value("${team.name}")
    public String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!";
    }

    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "Coach is : " + coachName + " & Team name is : " + teamName;
    }

    @GetMapping("/workout")
    public String getWorkoutDaily(){
        return "We did 5k running today";
    }

    @GetMapping("/fortune")
    public String getfortuneDaily(){
        return "I'm lucky today";
    }

}
