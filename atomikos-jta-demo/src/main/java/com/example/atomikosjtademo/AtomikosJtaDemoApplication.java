package com.example.atomikosjtademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ImportResource("classpath:spring-application-context.xml")
public class AtomikosJtaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtomikosJtaDemoApplication.class, args);
	}

}
