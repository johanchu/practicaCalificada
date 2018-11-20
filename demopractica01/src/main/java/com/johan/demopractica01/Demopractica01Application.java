package com.johan.demopractica01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.johan.controller","com.johan.config"})
public class Demopractica01Application {

	public static void main(String[] args) {
		SpringApplication.run(Demopractica01Application.class, args);
	}
}
