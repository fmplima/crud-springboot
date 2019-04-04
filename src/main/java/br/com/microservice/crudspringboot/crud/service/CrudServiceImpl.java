package br.com.microservice.crudspringboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;
import br.com.microservice.crudspringboot.crud.domain.repository.ModuleCourseRepository;

@Service
public class CrudServiceImpl implements CrudService {

	@Autowired
	private ModuleCourseRepository moduleCourseRepository;
	
	@Override
	public ModulesCourse find(final String idCourse) {
		ModulesCourse modulesCourse = moduleCourseRepository.findByIdCourse(idCourse);
		return modulesCourse;	
	}

	@Override
	public List<ModulesCourse> findAll() {
		List<ModulesCourse> modulesCoursesList = moduleCourseRepository.findAll();
		return modulesCoursesList;
	}

}
