package com.section.Language.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.section.Language.models.Language;
@Repository
public interface LanguageRep extends CrudRepository<Language, Long> {

	List<Language> findAll();
  
//    Long countByTitleContaining(String search);
//
//    Long deleteByTitleStartingWith(String search);


}
