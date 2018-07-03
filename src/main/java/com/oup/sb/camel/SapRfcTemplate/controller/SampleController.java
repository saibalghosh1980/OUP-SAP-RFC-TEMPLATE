package com.oup.sb.camel.SapRfcTemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/greeting")
	public String greeting() {
		return "Hello World!!!!";

	}
}
