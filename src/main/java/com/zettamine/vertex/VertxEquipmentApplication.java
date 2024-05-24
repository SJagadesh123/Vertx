package com.zettamine.vertex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class VertxEquipmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(VertxEquipmentApplication.class, args);
	}

}
