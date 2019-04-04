package br.com.microservice.crudspringboot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.mongodb.MongoException;

import br.com.microservice.crudspringboot.crud.api.rest.dto.CrudDto;
import br.com.microservice.crudspringboot.crud.api.rest.mapper.CrudMapper;
import br.com.microservice.crudspringboot.crud.domain.ModulesCourse;
import br.com.microservice.crudspringboot.crud.domain.repository.ModuleCourseRepository;

@Service
public class CrudServiceImpl implements CrudService {

	@Autowired
	private ModuleCourseRepository moduleCourseRepository;
	
	@Autowired
	private CrudMapper crudMapper;
	
	private static final String MESSENGER_SUCESS = "sucess";
	
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

	@Override
	public String insert(final CrudDto crudDto) {
		Gson gson = new Gson();
		
		try {
			ModulesCourse modulesCourseForSave = crudMapper.mapperToObject(crudDto);
			moduleCourseRepository.save(modulesCourseForSave);
		} catch (MongoException mge) {
			mge.getStackTrace();		
		}
		
		String logMessengerSucessful = 
				"{status: " + MESSENGER_SUCESS + "}" ;
		
		return gson.toJson(logMessengerSucessful);
		
	}
}
