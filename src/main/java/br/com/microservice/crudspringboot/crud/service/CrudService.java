package br.com.microservice.crudspringboot.crud.service;

import java.util.List;

import br.com.microservice.crudspringboot.crud.api.rest.dto.CrudDto;
import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;

public interface CrudService {

	ModulesCourse find(final String idCourse);

	List<ModulesCourse> findAll();

	String insert(final CrudDto crudRequest);
}
