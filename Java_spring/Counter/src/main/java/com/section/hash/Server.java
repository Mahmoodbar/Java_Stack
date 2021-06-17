package com.section.hash;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Server {
	@RequestMapping("/your_server")

	public String index( HttpSession session){
    
    Integer count = (Integer) session.getAttribute("count");
    if (count == null) {
    	session.setAttribute("count", 0);
    }
    else { 
    	
    count++;
    	session.setAttribute("count",count);
    }
    
    return "/server.jsp";
}
    

	@RequestMapping("/counter")
	public String counter(){

    return "/counter.jsp";
}
}
