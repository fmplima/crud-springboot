package br.com.microservice.crudspringboot.crud.service;

import java.util.List;

import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;

public interface CrudService {

	ModulesCourse find(final String idCourse);

	List<ModulesCourse> findAll();
}
