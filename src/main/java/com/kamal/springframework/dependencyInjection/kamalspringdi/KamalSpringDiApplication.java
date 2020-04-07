package com.kamal.springframework.dependencyInjection.kamalspringdi;

import com.kamal.springframework.dependencyInjection.kamalspringdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KamalSpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KamalSpringDiApplication.class, args);

		System.out.println("---- Primary Bean Injection -----");
		SampleController sampleController = (SampleController) ctx.getBean("sampleController");
		System.out.println(sampleController.sayHello());

		System.out.println("---- Property Dependency Injection -----");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)
				ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---- Setter Dependency Injection -----");

		SetterInjectedController setterInjectedController = (SetterInjectedController)
				ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---- Constructor Dependency Injection -----");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)
				ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
