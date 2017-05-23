package com.ClassList.ClassBuilder.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ClassList.ClassBuilder.domain.Classes;


public interface ClassesRepository extends CrudRepository<Classes, Integer> {

	Classes findByClassName(String className);
	
	List<Classes> findAllByClassName(String elementName);

}
