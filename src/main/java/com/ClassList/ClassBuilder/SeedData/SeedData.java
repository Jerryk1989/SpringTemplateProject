package com.ClassList.ClassBuilder.SeedData;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ClassList.ClassBuilder.domain.Classes;
import com.ClassList.ClassBuilder.domain.degreeProgram;
import com.ClassList.ClassBuilder.services.ClassesServices;
import com.ClassList.ClassBuilder.services.degreeProgramService;

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private ClassesServices classesService;
	
	@Autowired
	private degreeProgramService degreeProgramService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
//		generateClasses();
//		generateDegreePrograms();
//		
		generateAll();
	}

	
	private void generateClasses() {
		Classes classOne = new Classes();
		classOne.setClassName("Biology");
		classOne.setCreditCount(4);
		classesService.saveClass(classOne);
		
		Classes classTwo = new Classes();
		classTwo.setClassName("Math");
		classTwo.setCreditCount(3);
		classesService.saveClass(classTwo);
		
		Classes classThree = new Classes();
		classThree.setClassName("History");
		classThree.setCreditCount(4);
		classesService.saveClass(classThree);
		
	}
	
	private void generateDegreePrograms() {
		degreeProgram programOne = new degreeProgram();
		programOne.setDegreeProgramName("Computer Science");
	
		degreeProgram programTwo = new degreeProgram();
		programTwo.setDegreeProgramName("Networking");
		
		degreeProgram programThree = new degreeProgram();
		programThree.setDegreeProgramName("Database Administrator");
	}
	
	private void generateAll() {
		Classes classOne = new Classes();
		classOne.setClassName("Biology");
		classOne.setCreditCount(4);
		
		degreeProgram program1 = new degreeProgram("Computer Science");
		degreeProgram program2 = new degreeProgram("Networking");
		
		List<degreeProgram> degreeProgram = new ArrayList<degreeProgram>();
		degreeProgram.add(program1);
		degreeProgram.add(program2);
		
		classOne.setListOfdegreePrograms(degreeProgram);
		
		
		classesService.saveClass(classOne);
		
		
//		Classes classTwo = new Classes();
//		classTwo.setClassName("Math");
//		classTwo.setCreditCount(3);
//		classesService.saveClass(classTwo);
//		
//		Classes classThree = new Classes();
//		classThree.setClassName("History");
//		classThree.setCreditCount(4);
//		classesService.saveClass(classThree);
		
//		degreeProgram programTwo = new degreeProgram();
//		programTwo.setDegreeProgramName("Networking");
//		degreeProgramService.saveDegreeProgram(programTwo);
//		
//		degreeProgram programThree = new degreeProgram();
//		programThree.setDegreeProgramName("Database Administrator");
//		degreeProgramService.saveDegreeProgram(programThree);
//		
		
//		programOne.getListOfClasses().add(classOne);
//		programOne.getListOfClasses().add(classTwo);
//		programOne.getListOfClasses().add(classThree);
		
//		programTwo.getListOfClasses().add(classTwo);
//		programTwo.getListOfClasses().add(classThree);
//		programThree.getListOfClasses().add(classOne);
//		programThree.getListOfClasses().add(classThree);
	
		
	
	}
	
}
