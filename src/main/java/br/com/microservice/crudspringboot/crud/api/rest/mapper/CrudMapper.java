package br.com.microservice.crudspringboot.crud.api.rest.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import br.com.microservice.crudspringboot.crud.api.rest.dto.CrudDto;
import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;

@Configuration
public class CrudMapper {
	
	public ModulesCourse mapperToObject(final CrudDto crudDto) {
		
		ModelMapper modelMapper = new ModelMapper();
		ModulesCourse modulesCourse = modelMapper.map(crudDto, ModulesCourse.class);
		return modulesCourse;
	}
	
}
