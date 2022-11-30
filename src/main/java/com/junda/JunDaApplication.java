package com.junda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.junda")
public class JunDaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunDaApplication.class, args);
	}

}
