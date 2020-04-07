package com.kamal.springframework.dependencyInjection.kamalspringdi.services;

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository repository;

    public PrimaryGermanGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getGermanGreeting();
    }
}
