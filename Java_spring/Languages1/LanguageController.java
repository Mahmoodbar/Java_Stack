package com.section.Language;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.section.Language.models.Language;
import com.section.Language.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/language")
	public String index(Model model) {
		List<Language> Language = languageService.allLanguage();
		model.addAttribute("Language", Language);
		return "/Languages/main.jsp";
	}
}
