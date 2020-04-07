package com.kamal.springframework.dependencyInjection.kamalspringdi.services;

public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository repository;

    public PrimarySpanishGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getSpanishGreeting();
    }
}
