package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class Deletion {
	
	public static void main(String[] args) {
		
		Configuration sdf = new Configuration();
		sdf.configure("hibernate.cfg.xml");
		// Then we have to add the annotation class
		sdf.addAnnotatedClass(Employee.class);
		
		SessionFactory sd = sdf.buildSessionFactory();
		Session dd =sd.openSession();
		Transaction t = dd.beginTransaction();
		
		
		int id = 1;
		
		Employee sd1 = dd.get(Employee.class, id);
		
		dd.remove(sd1);
		// when removed do directly save
		t.commit();
		dd.close();
		
		System.out.println("Data deleted ... ");
		
		
	}

}
