package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Controller {
	
	public static void main(String[] args) {
		
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");   // we gave the file address of the db connection
		con.addAnnotatedClass(Student.class); // we say add this class as the table 
		
		
		SessionFactory sdd = con.buildSessionFactory();  // basically set up the session factory
		Session ss = sdd.openSession();   // we starts a session , like temprary connection to execute the query
		Transaction t = ss.beginTransaction();  // and then we use transaction for secure data operation
		
		// The database connection part in done
		
		Student sdd1 = new Student(23,"Suraj");
		// we pass values to the entity
		
		ss.persist(sdd1);
		// saves the object 
		
		t.commit();
		// save the changes;
		
		ss.close();
		
		System.out.println("Data is Inserted");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
