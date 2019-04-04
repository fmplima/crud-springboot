package br.com.microservice.crudspringboot.crud.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="modules_course")
public class ModulesCourse {
	
	@Id
	private String id;
	
	private String idCourse;
	private String name;
	private String module;
	
	public String getId() {
		return id;
	}
	
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
	
	@Override
	public String toString() {
		
		String moduleCourseFormat = 
				"{ idCourse + " + ","
				+ "name: " + name + "," 
				+ "module" + module + "}";	
		return moduleCourseFormat;
	}

}
