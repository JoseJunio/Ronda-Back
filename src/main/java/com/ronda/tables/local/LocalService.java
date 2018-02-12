package com.ronda.tables.local;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronda.tables.utils.GenericService;

@RestController
@RequestMapping(path = "/api/local")
public class LocalService extends GenericService<LocalEntity, Long>{
	
}

