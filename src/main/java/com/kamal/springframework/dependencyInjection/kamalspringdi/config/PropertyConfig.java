package com.kamal.springframework.dependencyInjection.kamalspringdi.config;


import com.kamal.springframework.dependencyInjection.kamalspringdi.examplebeans.FakeDataSource;
import com.kamal.springframework.dependencyInjection.kamalspringdi.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${kamal.database.username}")
    String username;

    @Value("${kamal.database.password}")
    String password;

    @Value("${kamal.database.url}")
    String dbUrl;

    @Value("${kamal.jms.username}")
    String jmsUserName;

    @Value("${kamal.jms.password}")
    String jmsUserPassword;

    @Value("${kamal.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(dbUrl);
        fakeDataSource.setSysUser(environment.getProperty("KAMAL_USERNAME"));
        return fakeDataSource;
    }

    @Bean
    public FakeJmsSource fakeJmsSource(){
        FakeJmsSource fakeJmsSource = new FakeJmsSource();
        fakeJmsSource.setJmsUserName(jmsUserName);
        fakeJmsSource.setJmsUserPassword(jmsUserPassword);
        fakeJmsSource.setJmsUrl(jmsUrl);
        return fakeJmsSource;
    }


}
