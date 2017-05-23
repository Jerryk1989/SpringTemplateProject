package com.ClassList.ClassBuilder.services;

import com.ClassList.ClassBuilder.domain.degreeProgram;

public interface degreeProgramService {

	Iterable<degreeProgram> listAllDegreePrograms();
	
	degreeProgram getDegreeProgramById(Integer id);
	
	degreeProgram saveDegreeProgram(degreeProgram degreeProgram);
	
	Iterable<degreeProgram> saveDegreeProgramList(Iterable<degreeProgram> degreeProgramIterable);
	
	void deleteDegreeProgram(Integer id);
}
