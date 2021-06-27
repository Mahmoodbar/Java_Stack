package com.section.NinjaDojo.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.section.NinjaDojo.models.Dojo;
import com.section.NinjaDojo.repositories.DojoRepo;
import com.section.NinjaDojo.repositories.NinjaRepo;

@Service
public class DojoService {	 
	
	private final DojoRepo dojoRepository;
	private final NinjaRepo ninjaRepository;
	
	    public DojoService(DojoRepo dojoRepository,NinjaRepo ninjaRepository) {
	        this.dojoRepository = dojoRepository;
	        this.ninjaRepository=ninjaRepository;
	    }
	
	    
	    public List<Dojo> allDojo() {
	    	return dojoRepository.findAll();
	    }
	 
	    
	    public Dojo createDojo(Dojo p) {
	        return dojoRepository.save(p);
	    }
	  

		public NinjaRepo getNinjaRepository() {
			return ninjaRepository;
		}
}
