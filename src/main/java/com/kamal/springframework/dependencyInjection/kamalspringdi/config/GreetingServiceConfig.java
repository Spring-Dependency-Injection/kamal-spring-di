package com.kamal.springframework.dependencyInjection.kamalspringdi.config;


import com.kamal.springframework.dependencyInjection.kamalspringdi.services.GreetingRepository;
import com.kamal.springframework.dependencyInjection.kamalspringdi.services.GreetingService;
import com.kamal.springframework.dependencyInjection.kamalspringdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryEnglishGreetingService(GreetingServiceFactory serviceFactory){
        return serviceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory serviceFactory){
       return serviceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory serviceFactory){
        return serviceFactory.createGreetingService("es");
    }


}
