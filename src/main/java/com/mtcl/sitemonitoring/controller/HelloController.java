package com.mtcl.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.mtcl.sitemonitoring.service.HelloSpringService;

@ManagedBean
public class HelloController {
	
	@ManagedProperty("#{helloSpringService}")
	private HelloSpringService helloSpringService;
	
	
	public String showHello(){
		return helloSpringService.sayHello();
	}

	public HelloSpringService getHelloSpringService() {
		return helloSpringService;
	}

	public void setHelloSpringService(HelloSpringService helloSpringService) {
		this.helloSpringService = helloSpringService;
	}
   
}
