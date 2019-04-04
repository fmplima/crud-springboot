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

@RestController
@RequestMapping(value="/api/courses")
public class CrudRestService {
	
	@Autowired
	private CrudService crudService;
	
	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public ResponseEntity<ModulesCourse> find(@RequestParam("idCourse") final String idCourse) {
		ModulesCourse modulesCourse = crudService.find(idCourse);
		return ResponseEntity.ok().body(modulesCourse);
	}
	
	@RequestMapping(value="/findAll", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public ResponseEntity<List<ModulesCourse>> findAll() {
		List<ModulesCourse> modulesCourseList = crudService.findAll();
		return new ResponseEntity<List<ModulesCourse>>(modulesCourseList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String add(@RequestBody CrudDto crudRequest) {
		return crudService.save(crudRequest);
	}
	
	@RequestMapping(value="/update",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String update(@RequestBody final CrudDto crudDtoUpdate){
		return crudService.updateCourse(crudDtoUpdate);
	}
}
