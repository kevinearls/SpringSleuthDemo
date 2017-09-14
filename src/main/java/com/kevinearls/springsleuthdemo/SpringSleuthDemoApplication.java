package com.kevinearls.springsleuthdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@SpringBootApplication
public class SpringSleuthDemoApplication {

	private static final Logger LOG = Logger.getLogger(SpringSleuthDemoApplication.class.getName());

	@RequestMapping("/")
	public String home() {
		Date now = new Date();
		LOG.log(Level.INFO, "you called home at " + now);
		return "Hello World at " + now;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringSleuthDemoApplication.class, args);
	}
}
