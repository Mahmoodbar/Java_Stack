package com.section.hash;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class DojoController {
	
	
@RequestMapping(value="/{dojo}" , method = RequestMethod.GET )
public String dojo(@PathVariable("dojo") String name) {
	return "the" + name + "is awesome";
}


@RequestMapping(value="/burbank-dojo")
public String burbank() {
	return "display a text that says 'Burbank Dojo is located in Southern California' ";
}

@RequestMapping(value="/san-jose")
public String san() {
	return "display a text that says 'SJ dojo is the headquarters";
}
}
