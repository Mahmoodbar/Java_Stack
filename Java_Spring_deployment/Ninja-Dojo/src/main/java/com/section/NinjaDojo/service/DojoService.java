package com.section.NinjaDojo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.section.NinjaDojo.models.Dojo;
import com.section.NinjaDojo.models.Ninja;
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
	
	    
	 
	    public Dojo createDojo(Dojo p) {
	        return dojoRepository.save(p);
	    }
	  


		public List<Dojo> findAll() {
			return dojoRepository.findAll();
		}


		

		public Ninja createNinja( Ninja ninja) {
			return ninjaRepository.save(ninja);
			
		}


		
		
		public Dojo findDojo(Long id) {
			Optional<Dojo> optionaldojo = dojoRepository.findById(id);
			if( optionaldojo.isPresent()) {
				return optionaldojo.get();
			}
			else {
			return null ;
		}
		}


}
