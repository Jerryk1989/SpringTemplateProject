package com.ClassList.ClassBuilder.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class degreeProgram {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer degreeProgramId;
	
	@Version
	private Integer Version;
	
	private String degreeProgramName;
	
	public degreeProgram() {
		
	}
	
	public degreeProgram(String degreeProgramName) {
		this.degreeProgramName = degreeProgramName;
	}

	@ManyToMany(mappedBy="listOfDegreePrograms", fetch = FetchType.LAZY)
	private List<Classes> listOfClasses = new ArrayList<Classes>();
	
	public List<Classes> getListOfClasses() {
		return listOfClasses;
	}
	
	public void setListOfClasses(List<Classes> listOfClasses) {
		this.listOfClasses = listOfClasses;
	}
	
	public String getDegreeProgramName() {
		return degreeProgramName;
	}

	public void setDegreeProgramName(String degreeProgramName) {
		this.degreeProgramName = degreeProgramName;
	}
}
