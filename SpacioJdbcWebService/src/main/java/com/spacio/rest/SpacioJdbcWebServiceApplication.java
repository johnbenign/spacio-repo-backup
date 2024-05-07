package com.spacio.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//(scanBasePackages = {"com.spacio.rest", "com.spacio.conn"})
public class SpacioJdbcWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpacioJdbcWebServiceApplication.class, args);
	}

}
