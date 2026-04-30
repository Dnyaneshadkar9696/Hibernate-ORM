package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class Update {
	
	public static void main(String[] args) {
		
		
		Configuration sdf = new Configuration();
		sdf.configure("hibernate.cfg.xml");
		// Then we have to add the annotation class
		sdf.addAnnotatedClass(Employee.class);
		
		SessionFactory sd = sdf.buildSessionFactory();
		Session dd =sd.openSession();
		Transaction t = dd.beginTransaction();
		
		
		int id = 4;
		
		Employee sm = dd.get(Employee.class, id);
		// we are getting the session 
		
		// can perform operation on the object 
		
		sm.setEmail("ROHIT@gmail.com");
		sm.setPhone("1111111111");
		
		dd.merge(sm);
		t.commit();
		dd.close();
		
		System.out.println("Data updated ...");
		
		
		
		
	}

}
