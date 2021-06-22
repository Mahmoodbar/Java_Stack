package com.section.Language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.section.Language.models.Language;
import com.section.Language.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/languages")
	public String showLanguages(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = languageService.allLanguage();
		model.addAttribute("languages", languages);
		return "/Languages/main.jsp";
	}

	@RequestMapping(value = "/test/languages", method = RequestMethod.POST)
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "/Languages/main.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	   @RequestMapping(value="/languages/{id}/delete", method=RequestMethod.DELETE)
	    public String destroy(@PathVariable("id") Long id) {
		   languageService.deleteLanguage(id);
	        return "redirect:/languages";
	    }
	   
	   @RequestMapping("/languages/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model) {
		   Language language = languageService.findLanguage(id);
	        model.addAttribute("language", language);
	        return "/Languages/edit.jsp";
	    }
	   
	   @RequestMapping(value="/languages/{id}/new")
	    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/Languages/edit.jsp";
	        } else {
	            languageService.updateBook(language);
	            return "redirect:/languages";
	        }
	    }
	    @RequestMapping("/languages/{id}")
	    public String show(@PathVariable("id") Long id, Model model) {
	        Language Language =  languageService.findLanguage(id);
	        model.addAttribute("language", Language);
	        return "/Languages/show.jsp";
	    }
}
