package com.rest.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.rest.mysql.pojo","com.rest.mysql.service","com.rest.mysql.model","com.rest.mysql.controller","com.rest.mysql.exceptions"})
@EnableJpaRepositories(basePackages = "com.rest.mysql.repositories")
public class RestMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestMysqlApplication.class, args);
	}

}
