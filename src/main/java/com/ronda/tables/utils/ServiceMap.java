package com.ronda.tables.utils;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(consumes = "application/json", produces = "application/json")
//@CrossOrigin(origins = "https://ronda-back.herokuapp.com", allowCredentials="false")
@CrossOrigin(origins = "https://ronda-front.herokuapp.com", allowCredentials="false")
public interface ServiceMap {
	
}
