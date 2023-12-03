//This DemoService is only for demo purpose
//do not alter or delete it
//create your own Service class and interface in package(com.velocity.Ecommerce.service) 
package com.velocity.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Ecommerce.model.Demo;

@Service
public class DemoService implements DemoInterface{
	// created only for demo purpose
	@Autowired
	private com.velocity.Ecommerce.repository.DemoInterface demoInterface;
	
	@Override
	public Demo saveDemo(Demo demo) {
		return demoInterface.save(demo);
	}

}
