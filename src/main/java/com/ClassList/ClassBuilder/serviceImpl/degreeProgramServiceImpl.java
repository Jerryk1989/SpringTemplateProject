package com.ClassList.ClassBuilder.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClassList.ClassBuilder.domain.degreeProgram;
import com.ClassList.ClassBuilder.repositories.degreeProgramRepository;
import com.ClassList.ClassBuilder.services.degreeProgramService;

@Service
public class degreeProgramServiceImpl implements degreeProgramService {

	@Autowired
	private degreeProgramRepository degreeProgramRepository;
	
	@Override
	public Iterable<degreeProgram> listAllDegreePrograms() {
		// TODO Auto-generated method stub
		return degreeProgramRepository.findAll();
	}

	@Override
	public degreeProgram getDegreeProgramById(Integer id) {
		// TODO Auto-generated method stub
		return degreeProgramRepository.findOne(id);
	}

	@Override
	public degreeProgram saveDegreeProgram(degreeProgram degreeProgram) {
		// TODO Auto-generated method stub
		return degreeProgramRepository.save(degreeProgram);
	}

	@Override
	public Iterable<degreeProgram> saveDegreeProgramList(Iterable<degreeProgram> degreeProgramIterable) {
		// TODO Auto-generated method stub
		return degreeProgramRepository.save(degreeProgramIterable);
	}

	@Override
	public void deleteDegreeProgram(Integer id) {
		// TODO Auto-generated method stub
		degreeProgramRepository.delete(id);
	}

}
