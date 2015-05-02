package com.mtcl.sitemonitoring;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloController {
	
	public String showHello(){
		return "Hello from Managed bean";
	}

}
