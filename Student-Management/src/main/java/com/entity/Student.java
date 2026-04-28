package com.entity;

import jakarta.persistence.*;


@Entity // creates the table in the database
public class Student {
	
	// now the entity class in done and we form the db connection in the controller
	
	@Id
	private int studID;
	private String studName;
	
	public Student() {
		
		
		
		
	}
	
	
	public Student(int studID, String studName) {
		
		this.studID = studID;
		this.studName = studName;
	}


	public int getStudID() {
		return studID;
	}


	public void setStudID(int studID) {
		this.studID = studID;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	@Override
	public String toString() {
		return "Student [studID=" + studID + ", studName=" + studName + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
