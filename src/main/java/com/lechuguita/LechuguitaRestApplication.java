package com.lechuguita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LechuguitaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LechuguitaRestApplication.class, args);
	}

}
