package com.kamal.springframework.dependencyInjection.kamalspringdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SampleController {

    public String sayHello(){
        System.out.println("Hello World !!");
        return "Hi Folks!";
    }

}
