package com.arman.learnGraphQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LearnGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnGraphQlApplication.class, args);
	}
}
