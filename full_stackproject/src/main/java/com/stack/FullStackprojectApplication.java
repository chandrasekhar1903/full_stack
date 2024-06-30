package com.stack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("springboot")
@ComponentScan(basePackages={"com.stack.contoller"})
public class FullStackprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackprojectApplication.class, args);
	}

}
