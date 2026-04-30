package com.entity;

import jakarta.persistence.*;

@Entity // This will create the table
@Table(name = "EmpData")
public class Employee {
	
	// The Entity will be Employee;
	
	@Id
	private int id;
	
	@Column (nullable = false)  // this says the value cannot be null
	private String name;
	@Column (unique = true)
	private String email;
	@Column (name = "MobileNO")
	private String phone;
	private double salary;
	
	public Employee() {
		 
	}

	public Employee(int id, String name, String email, String phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", salary=" + salary
				+ "]";
	}

	
	
	
	
	

}
