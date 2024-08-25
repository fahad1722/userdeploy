package com.deploy.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.deploy.user.repository")

public class UserDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDeployApplication.class, args);
	}

}
