package br.com.microservice.crudspringboot.crud.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.crudspringboot.crud.api.rest.dto.CrudDto;
import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;
import br.com.microservice.crudspringboot.crud.service.CrudService;

/**
 * @author felipe.lima
 * Implementation of service 
 */

@RestController
@RequestMapping(value="/api/courses")
public class CrudRestService {
	
	@Autowired
	private CrudService crudService;
	
	/**
	 * The method find / CRUD
	 * @param id
	 */
	
	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public ResponseEntity<ModulesCourse> find(@RequestParam("idCourse") final String idCourse) {
		ModulesCourse modulesCourse = crudService.find(idCourse);
		return ResponseEntity.ok().body(modulesCourse);
	}
	
	/**
	 * The method all data return / CRUD
	 */
	
	@RequestMapping(value="/findAll", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public ResponseEntity<List<ModulesCourse>> findAll() {
		List<ModulesCourse> modulesCourseList = crudService.findAll();
		return new ResponseEntity<List<ModulesCourse>>(modulesCourseList, HttpStatus.OK);
	}
	
	/**
	 * The method insert the data / CRUD
	 * @param object crudDto
	 */
	
	@RequestMapping(value="/add", produces=MediaType.APPLICATION_JSON_VALUE, 
			consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public String add(@RequestBody CrudDto crudRequest) {
		return crudService.save(crudRequest);
	}
	
	/**
	 * The method update the data in dataBase / CRUD
	 * @param object crudDto
	 */
	
	@RequestMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, 
			method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String update(@RequestBody final CrudDto crudDtoUpdate){
		return crudService.updateCourse(crudDtoUpdate);
	}
	
	/**
	 * The method remove the data specify in dataBase / CRUD
	 * @param idCourse
	 * @param name
	 */
	
	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.DELETE)
	public String delete(@RequestParam("idCourse") final String idCourse, 
			@RequestParam("name") final String name) {
		return crudService.deleteCourse(idCourse);
	}
	
}
