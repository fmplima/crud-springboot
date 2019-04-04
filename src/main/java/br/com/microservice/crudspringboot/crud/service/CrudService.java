package br.com.microservice.crudspringboot.crud.service;

import java.util.List;

import br.com.microservice.crudspringboot.crud.api.rest.dto.CrudDto;
import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;

/**
 * @author felipe.lima
 * Interface of services 
 */

public interface CrudService {

	/**
	 * The method find data
	 * @param idCourse
	 */
	
	ModulesCourse find(final String idCourse);
	
	/**
	 * The method return all find
	 */
	
	List<ModulesCourse> findAll();

	/**
	 * The insert the register
	 * @param object CrudDto
	 */
	
	String save(final CrudDto crudRequest);

	/**
	 * The update the register
	 * @param object CrudDto
	 */
	
	String updateCourse(final CrudDto crudDto);

	/**
	 * The remove register in dataBase
	 * @param idCourse
	 */
	
	String deleteCourse(String idCourse);
}
