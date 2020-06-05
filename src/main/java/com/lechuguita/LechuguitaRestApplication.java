package com.lechuguita;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LechuguitaRestApplication {
	
	private static final Logger logger = LogManager.getLogger(LechuguitaRestApplication.class);

	public static void main(String[] args) {
		logger.info("Se arranca el servidor Lechu Spring");
		logger.error("Se arranca el servidor Lechu Spring");

		SpringApplication.run(LechuguitaRestApplication.class, args);
		
	}

}
