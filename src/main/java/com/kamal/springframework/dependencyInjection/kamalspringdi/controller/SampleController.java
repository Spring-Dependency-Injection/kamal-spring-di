package com.kamal.springframework.dependencyInjection.kamalspringdi.controller;

import com.kamal.springframework.dependencyInjection.kamalspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SampleController {

    private final GreetingService greetingService;

    public SampleController(@Qualifier("primaryGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
