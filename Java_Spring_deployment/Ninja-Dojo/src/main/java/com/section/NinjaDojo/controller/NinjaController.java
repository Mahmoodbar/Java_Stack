package com.section.NinjaDojo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.section.NinjaDojo.models.Dojo;
import com.section.NinjaDojo.models.Ninja;
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
	    @RequestMapping("/dojos/new/create")
		public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
			if (result.hasErrors()) {
				return "/dojo.jsp";
			} else {
				dojoService.createDojo(dojo);
				return "redirect:/dojo/new";
			}
		}

		@RequestMapping("/ninja/new")
		public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
			List<Dojo> dojos = dojoService.findAll();
			model.addAttribute("dojo", dojos);
			return "ninja.jsp";
		}

		@RequestMapping("/ninja/new/create")
		public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
			if (result.hasErrors()) {
				return "/newninja.jsp";
			} 
			else {
				dojoService.createNinja(ninja);
			}
				return "redirect:/ninja/new";
			
		}
		@RequestMapping("/dojo/{id}")
		public String table(@PathVariable("id") Long id, Model model) {
			
			Dojo dojo = dojoService.findDojo(id);
			model.addAttribute("dojo", dojo);
			return "table.jsp";
			
		}
}
