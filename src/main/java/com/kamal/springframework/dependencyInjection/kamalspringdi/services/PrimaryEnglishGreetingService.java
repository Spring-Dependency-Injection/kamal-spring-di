package com.kamal.springframework.dependencyInjection.kamalspringdi.services;

public class PrimaryEnglishGreetingService implements GreetingService {

    private GreetingRepository repository;

    public PrimaryEnglishGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getEnglishGreeting();
    }
}
