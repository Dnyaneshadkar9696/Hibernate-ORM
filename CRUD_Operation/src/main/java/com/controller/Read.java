package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.descriptor.sql.internal.Scale6IntervalSecondDdlType;

import com.entity.Employee;

public class Read {
	
	
	public static void main(String[] args) {
		
		Configuration sdf = new Configuration();
		sdf.configure("hibernate.cfg.xml");
		// Then we have to add the annotation class
		sdf.addAnnotatedClass(Employee.class);
		
		SessionFactory sd = sdf.buildSessionFactory();
		Session dd =sd.openSession();
		Transaction t = dd.beginTransaction();
		
		
		int id = 5;
		
		Employee hj = dd.get(Employee.class, id);
		
	   System.out.println(hj);
	   
	   t.commit();
	   dd.close();
	   
	   
		
	}

}
