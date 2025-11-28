package com.techviews.Week1Practice;

import com.techviews.Week1Practice.service.CakeBakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1PracticeApplication implements CommandLineRunner {

	@Autowired
	private CakeBakerService cakeBakerService;

	public static void main(String[] args) {
		SpringApplication.run(Week1PracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBakerService.bakeCake();
	}
}
