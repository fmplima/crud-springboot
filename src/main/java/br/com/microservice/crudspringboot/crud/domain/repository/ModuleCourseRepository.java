package br.com.microservice.crudspringboot.crud.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;

public interface ModuleCourseRepository extends MongoRepository<ModulesCourse, String>{
	
	ModulesCourse findByIdCourse(final String idCourse);

	void deleteByIdCourse(String idCourse);
	
}
