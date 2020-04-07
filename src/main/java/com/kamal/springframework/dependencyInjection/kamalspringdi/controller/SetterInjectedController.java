package com.kamal.springframework.dependencyInjection.kamalspringdi.controller;

import com.kamal.springframework.dependencyInjection.kamalspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;


    @Autowired
    public void setGreetingService(@Qualifier("setterInjectedGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
