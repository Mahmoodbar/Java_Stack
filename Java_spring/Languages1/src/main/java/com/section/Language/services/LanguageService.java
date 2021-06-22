package com.section.Language.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.section.Language.models.Language;
import com.section.Language.repositories.LanguageRep;

@Service
public class LanguageService {

	private final LanguageRep languageRepository;

	public LanguageService(LanguageRep languageRepository) {
		this.languageRepository = languageRepository;
	}

	// returns all the books
	public List<Language> allLanguage() {
		return languageRepository.findAll();
	}

	public Language createLanguage(Language b) {
		return languageRepository.save(b);
	}

	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

	 public void deleteLanguage(Long id) {
	     languageRepository.deleteById(id);
	 }
	 public Language updateBook(Language Language) {
	 	 return languageRepository.save(Language);
	}

}
