package com.velocity.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.Ecommerce.model.Demo;
import com.velocity.Ecommerce.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@PostMapping("/save")
	public Demo saveDemo(@RequestBody Demo demo) {
		Demo demo1 = demoService.saveDemo(demo);
		return demo1;
	}
}
