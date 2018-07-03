package com.oup.sb.camel.SapRfcTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

@EnableDiscoveryClient
@SpringBootApplication
@ImportResource({ "classpath:META-INF/spring/camel-context.xml" })
public class SapRfcTemplateSpringBootApplication {

	/**
	 * A main method to start this application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SapRfcTemplateSpringBootApplication.class, args);
	}

}
