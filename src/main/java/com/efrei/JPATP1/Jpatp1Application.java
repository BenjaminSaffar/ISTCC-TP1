package com.efrei.JPATP1;


//import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Jpatp1Application {

	private static final Logger log = LoggerFactory.getLogger(Jpatp1Application.class);
	public static void main(String[] args) {
		
		SpringApplication.run(Jpatp1Application.class, args);
	}
	/*
	 * 
	 * @Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			
			
			});
*/
}
