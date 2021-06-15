package com.section.hash;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Human {
	
	
@RequestMapping("/your_server")
public String Human() {	
	String x = " <h1>Hello Human </h1> "
			+ "Welcome to Spring boot ";
	return x;
}

@RequestMapping(value = "/someone" , method = RequestMethod.GET)
public String Hello (@RequestParam(value="name" , required = false) String name) {
	if (name != null)
		return "<h1>Hello</h1>" + name 
				
				+ "Welcome to SpringBoot";
	return "sorry you're out";
}


}
