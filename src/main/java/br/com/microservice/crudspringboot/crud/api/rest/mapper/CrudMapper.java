package br.com.microservice.crudspringboot.crud.api.rest.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import br.com.microservice.crudspringboot.crud.api.rest.dto.CrudDto;
import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;

@Configuration
public class CrudMapper {
	
	public ModulesCourse mapperToObject(final CrudDto crudDto) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(crudDto, ModulesCourse.class);	
	}
	
	public CrudDto mapperObjectToDto(final ModulesCourse modulesCourse) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(modulesCourse, CrudDto.class);
	}
	
}
