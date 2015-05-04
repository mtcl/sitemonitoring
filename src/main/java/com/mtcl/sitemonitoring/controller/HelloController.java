package com.mtcl.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import lombok.Getter;
import lombok.Setter;

import com.mtcl.sitemonitoring.service.HelloSpringService;

@ManagedBean
@Getter
@Setter
public class HelloController {
	
	@ManagedProperty("#{helloSpringService}")
	private HelloSpringService helloSpringService;
	
	
	public String showHello(){
		return helloSpringService.sayHello();
	}

}
