package com.section.NinjaDojo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.section.NinjaDojo.models.Dojo;
import com.section.NinjaDojo.service.DojoService;

@Controller
public class NinjaController {

	  private final DojoService dojoService;
	    
	    public NinjaController(DojoService dojoService) {
	    	
	        this.dojoService = dojoService;
	    }
		@RequestMapping("/dojo/new" )
		public String newdojo()
		{
			return "dojo.jsp";
		}
	    
	 
	    
	    @RequestMapping(value="/dojo/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("dojo") Dojo dojo) {
	      dojoService.createDojo(dojo);
	     return  "redirect:/dojo/new" ;
	      
}
}
