package com.ronda.tables.funcionario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronda.tables.local.LocalEntity;
import com.ronda.tables.utils.GenericService;

@RestController
@RequestMapping(path = "/api/funcionario")
public class FuncionarioService extends GenericService<FuncionarioEntity, Long>{

}
