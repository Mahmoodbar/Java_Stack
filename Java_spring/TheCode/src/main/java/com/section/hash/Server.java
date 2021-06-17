package com.section.hash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Server {
	
	@RequestMapping("/")
	public String main() {
	return "Secret.jsp";
}

@RequestMapping(value ="/code" , method = RequestMethod.POST)
public String check(@RequestParam(value="insert")String insert) {
	
	if(insert.equals("bushido")) {
		return "code.jsp";
		}
	
	return "Secret.jsp";
	 	
}

}
