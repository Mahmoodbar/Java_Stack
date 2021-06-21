package com.section.hash;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/")
public class NinjaGold {
	Random r= new Random();
	@RequestMapping("")
	public String main() {
		return "main.jsp";
	}
	
	@RequestMapping(value ="/farmProcess" , method = RequestMethod.POST)
	public String farmProcess( HttpSession session , @RequestParam(value = "place") String place ) {
		int x = 0;
		String y;
		Integer gold =(Integer)session.getAttribute("gold");
		
    if (gold ==null) {
    	
    	session.setAttribute("gold",0);
    }
              
              
        if (place.equals("farm")){
		 x= (Integer)r.nextInt(20-10)+10;
		
	}
        else if (place.equals("cave")) {
        	 x= (Integer)r.nextInt(10-5)+5;
        	 y= "you entered a cave and earned"+ gold + "gold";
        		
     		
        }
        else if (place.equals("House")) {
       	 x= (Integer)r.nextInt(5-2)+2;
       	y= "you entered a House and earned"+ gold + "gold";
 		

        	
        }
        else if (place.equals("casino")) {
        	
          	 x= (Integer)r.nextInt(50+50)-50;
          	y= "you entered a casino and earned"+ gold + "gold";
    	
        }	
        session.setAttribute("gold",(Integer)session.getAttribute("gold")+x);
        session.setAttribute("activity",(String)session.getAttribute("activity"));
     return "redirect:/";

	
}
}
