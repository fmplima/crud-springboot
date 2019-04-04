package br.com.microservice.crudspringboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.crudspringboot.service.CrudService;

@RestController
@RequestMapping(value="/api/crud")
public class CrudRestService {
	
	@Autowired
	private CrudService crudService; 
	
	@RequestMapping(value="{name},{idCourse}", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public HttpStatus find(@PathVariable final String name, @PathVariable final String idCourse) {
		
		crudService.find(name);
		
		return HttpStatus.OK;
	}
	
}
