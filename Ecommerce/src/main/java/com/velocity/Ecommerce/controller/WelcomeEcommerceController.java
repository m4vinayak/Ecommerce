package com.velocity.Ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeEcommerceController {
	
//	http://localhost:8080/welcome/ecommerce_app
	@GetMapping("/ecommerce_app")
	public String welcome() {
		return "Welcome to Ecommerce Application";
	}	

}
