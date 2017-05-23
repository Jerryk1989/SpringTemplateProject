package com.ClassList.ClassBuilder.serviceImpl;

import com.ClassList.ClassBuilder.services.ClassesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClassList.ClassBuilder.domain.Classes;
import com.ClassList.ClassBuilder.repositories.ClassesRepository;

@Service
public class ClassesServiceImpl implements ClassesServices {

	@Autowired
	private ClassesRepository ClassesRepository;

	@Override
	public Iterable<Classes> listAllClasses() {
		return ClassesRepository.findAll();
	}

	@Override
	public Classes getClassesById(Integer id) {
		return ClassesRepository.findOne(id);
	}

	@Override
	public Classes saveClass(Classes classes) {
		return ClassesRepository.save(classes);
	}

	@Override
	public Iterable<Classes> saveClassesList(Iterable<Classes> classesIterable) {
		return ClassesRepository.save(classesIterable);
	}

	@Override
	public void deleteClasses(Integer id) {
		ClassesRepository.delete(id);
	}
	
	
}
