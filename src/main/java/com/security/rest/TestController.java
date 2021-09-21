package com.security.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

	@RequestMapping("/test")
	public String testMethod() {
		return "Hello, World";
	}
}