package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EntityScan("com.test")
@EnableJpaRepositories("com.test")
public class DbConnectionApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DbConnectionApplication.class, args);
		DbConnectionApplication dbca = context.getBean(DbConnectionApplication.class);
		dbca.testDB();
	}
	
	//injecting service and using it
	@Autowired
	private EBUservice ebuservice;
	private void testDB() {
		ebuservice.retrieveAll();
	}
	
}
