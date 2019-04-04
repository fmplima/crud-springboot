package br.com.microservice.crudspringboot.crud.api.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class CrudDto {

	private String idCourse;
	private String name;
	private String module;
	
	public String getIdCourse() {
		return idCourse;
	}
	
	public void setIdCourse(String idCourse) {
		this.idCourse = idCourse;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getModule() {
		return module;
	}
	
	public void setModule(String module) {
		this.module = module;
	}
	
}
