package com.tushar.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class BaseBallCoach implements  Coach{

    public  BaseBallCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override

    public String getDailyWorkout (){
        return "Spend 30 min in net practice";
    }
}
