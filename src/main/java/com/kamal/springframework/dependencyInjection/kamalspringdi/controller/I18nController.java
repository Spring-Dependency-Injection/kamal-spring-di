package com.kamal.springframework.dependencyInjection.kamalspringdi.controller;

import com.kamal.springframework.dependencyInjection.kamalspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;


    public I18nController(@Qualifier("I18nservice") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
