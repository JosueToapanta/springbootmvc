package com.bolsadeideas.springboot.di.app.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.bolsadeideas.springboot.di.app.controllers"})
public class SpringBootDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDiApplication.class, args);
	}

}
