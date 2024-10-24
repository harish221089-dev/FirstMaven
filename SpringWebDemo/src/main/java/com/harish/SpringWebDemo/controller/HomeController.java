package com.harish.SpringWebDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/Hello")
	public String getDemo() {
		return "Welcome to walmart... dood";
	}

}
