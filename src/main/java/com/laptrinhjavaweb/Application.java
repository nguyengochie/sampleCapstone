package com.laptrinhjavaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * @ComponentScan(basePackages="com.laptrinhjavaweb")
 * 
 * @EntityScan(basePackages="com.laptrinhjavaweb")
 * 
 * @EnableJpaRepositories(basePackages="com.laptrinhjavaweb")
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
