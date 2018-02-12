package com.ronda.tables.ronda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronda.tables.utils.GenericService;

@RestController
@RequestMapping(path = "/api/ronda")
public class RondaService extends GenericService<RondaEntity, Long>{

}
