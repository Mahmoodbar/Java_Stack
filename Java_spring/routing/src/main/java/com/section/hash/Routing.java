package com.section.hash;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
public class Routing {
	@RequestMapping(value= "/coding" , method = RequestMethod.GET)
	public String getCoding() {
		
		return "helloo CodingDojo";
	}
	
	@RequestMapping(value= "/coding/python",method = RequestMethod.GET)
	
	public String getPython() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping(value= "/coding/java",method = RequestMethod.GET)
	public String getJava() {
		return "Java/Spring is better!";
	}
	
	
	

	
}
