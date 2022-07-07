package com.gardenApps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan( basePackages = {"com.gardenApps.controller", "com.gardenApps.exception",
    "com.gardenApps.model", "com.gardenApps.respository", "com.gardenApps.service.impl"})
@EntityScan("com.gardenApps")
@EnableJpaRepositories(basePackages = "com.gardenApps")

public class GardenAppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenAppsApplication.class, args);
	}

}
