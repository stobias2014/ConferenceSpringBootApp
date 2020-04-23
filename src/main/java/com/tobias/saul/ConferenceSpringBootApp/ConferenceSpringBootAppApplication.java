package com.tobias.saul.ConferenceSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication

//@EntityScan("com.tobias.saul.models")
//@EnableJpaRepositories("com.tobias.saul.repositories")

public class ConferenceSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceSpringBootAppApplication.class, args);
	}

}
