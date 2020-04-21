package com.kamal.springframework.dependencyInjection.kamalspringdi;

import com.kamal.springframework.dependencyInjection.kamalspringdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KamalSpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KamalSpringDiApplication.class, args);

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUserName());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getDbUrl());
	}

}
