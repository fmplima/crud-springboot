package br.com.microservice.crudspringboot.resource;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class CrudRestService {
	
	@RequestMapping(value="/{name}", produces=MediaType.APPLICATION_JSON_VALUE, 
			params= "name", method=RequestMethod.GET	 )
	public HttpStatus find(@PathParam("name") final String name) {
		return HttpStatus.OK;
	}
	
}
