package com.kamal.springframework.dependencyInjection.kamalspringdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Spring World --- Setter Injection";
    }
}
