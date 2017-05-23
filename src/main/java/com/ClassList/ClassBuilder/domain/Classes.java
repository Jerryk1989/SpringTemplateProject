package com.ClassList.ClassBuilder.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Classes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer classId;
	
	@Version
	private Integer Version;
	
	
	private String className;
	private Integer creditCount;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="ClassesAndDegress", 
		joinColumns=@JoinColumn(name="classId", referencedColumnName="classId"), 
		inverseJoinColumns=@JoinColumn(name="degreeProgramId", referencedColumnName="degreeProgramId"))
	private List<degreeProgram> listOfDegreePrograms = new ArrayList<degreeProgram>();
	
	public List<degreeProgram> getListOfDegreePrograms() {
		return listOfDegreePrograms;
	}
	
	public void setListOfdegreePrograms(List<degreeProgram> listOfDegreePrograms) {
		this.listOfDegreePrograms = listOfDegreePrograms;
	}
	
	
	public Classes() {
		
	}
	
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getCreditCount() {
		return creditCount;
	}

	public void setCreditCount(Integer creditCount) {
		this.creditCount = creditCount;
	}	
	
}
