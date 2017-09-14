package com.kevinearls.springsleuthdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@SpringBootApplication
public class SpringSleuthDemoApplication {

	private static final Logger LOG = Logger.getLogger(SpringSleuthDemoApplication.class.getName());
	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/")
	public String home() {
		Date now = new Date();
		LOG.log(Level.INFO, "you called home at " + now);
		return "Hello World at " + now;
	}

	@RequestMapping("/callHome")
	public String callHome() {
		LOG.log(Level.INFO, "calling home");
		return restTemplate.getForObject("http://localhost:8080", String.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringSleuthDemoApplication.class, args);
	}
}
