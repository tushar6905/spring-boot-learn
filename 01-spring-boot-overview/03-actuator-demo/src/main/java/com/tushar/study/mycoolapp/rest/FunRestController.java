package com.tushar.study.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!";

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
