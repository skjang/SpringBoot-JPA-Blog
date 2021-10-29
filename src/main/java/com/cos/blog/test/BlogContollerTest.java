package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogContollerTest {

	@GetMapping("/test/hello")
	public String sayHello() {
		return "Hello";
	}
	
}
