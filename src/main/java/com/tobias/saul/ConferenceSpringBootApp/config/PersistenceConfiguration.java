package com.tobias.saul.ConferenceSpringBootApp.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// look into auto configuration

@Configuration
public class PersistenceConfiguration {
	@Bean
	public DataSource dataSource() {
		DataSourceBuilder builder =  DataSourceBuilder.create();
		//builder.url("jdbc:mysql://localhost:3306/conference_demo?serverTimezone=UTC");
		builder.url(System.getenv("DB_URL"));
		builder.username(System.getenv("USER"));
		builder.password(System.getenv("PASSWORD"));
		System.out.println("Custom datasource bean init and set.");
		return builder.build();	
	}
}
