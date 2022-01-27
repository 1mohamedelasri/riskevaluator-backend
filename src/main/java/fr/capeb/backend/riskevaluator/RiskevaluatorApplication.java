package fr.capeb.backend.riskevaluator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiskevaluatorApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(RiskevaluatorApplication.class, args);
	}

}

