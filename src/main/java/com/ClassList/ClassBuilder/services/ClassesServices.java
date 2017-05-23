package com.ClassList.ClassBuilder.services;

import com.ClassList.ClassBuilder.domain.Classes;

public interface ClassesServices {

	Iterable<Classes> listAllClasses();
	
	Classes getClassesById(Integer id);
	
	Classes saveClass(Classes classes);
	
	Iterable<Classes> saveClassesList(Iterable<Classes> classesIterable);
	
	void deleteClasses(Integer id);
}
