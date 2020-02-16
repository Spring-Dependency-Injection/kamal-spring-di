package com.kamal.springframework.dependencyInjection.kamalspringdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ITA")
@Service("I18nservice")
public class I18nItalianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Ciao amici";
    }
}
