package com.controller;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.entity.Employee;


public class Insertion {
	
	// now the entity class is ready lets make the operations
	
	
	public static void main(String[] args) {
		
		Configuration sdf = new Configuration();
		sdf.configure("hibernate.cfg.xml");
		// Then we have to add the annotation class
		sdf.addAnnotatedClass(Employee.class);
		
		SessionFactory sd = sdf.buildSessionFactory();
		Session dd =sd.openSession();
		Transaction t = dd.beginTransaction();
		
//		Employee e = new Employee();
//		e.setName("Rahul");
//		e.setPhone("6453453334");
//		e.setEmail("rahul@gamil.com");
//		e.setSalary(38533.45);
		
		Employee e2 = new Employee();
		e2.setName("Rakesh");
		e2.setEmail("rakesh@gmail.com");
		e2.setPhone("35353533");
		e2.setSalary(353565.344);
		
	
		
//		dd.persist(e);
		dd.persist(e2);
		t.commit();
		dd.close();
		sd.close();
		
		
		System.out.println("Data Inserted..");
		
		
		
		
		
	}
	
	

}
