package com.section.hash;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class survey {
	@RequestMapping("/")
public String main() {
		
		return "main.jsp";
	}

	@RequestMapping(value ="/proccess" , method = RequestMethod.POST)
	public String proccess(HttpSession session,@RequestParam(value="name") String name,@RequestParam(value="location") String location,@RequestParam(value="language") String language,@RequestParam(value="comment") String comment) {
		
		 session.setAttribute("name", name);
		 session.setAttribute("location", location);
		 session.setAttribute("language", language);
		 session.setAttribute("comment", comment);
		 
		return "redirect:/result";
	}
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
}
