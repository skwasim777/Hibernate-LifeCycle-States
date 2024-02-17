package com.hibernate.state;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		s.setId(101);// now this object is in transient state
//		s.setClgName("SSM clg");
//		s.setName("Wasim");
//		s.setCourse("Bsc");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student s= session.get(Student.class,101);
		session.delete(s);
		System.out.println("deleted successfully");
//		session.save(s);// now our object is in persistent state bcs it is associated with persistent
						// also and session also
//		s.setName("Salman");
		tx.commit();
//		session.close();
//		s.setName("lukman");// now our object is in detached state
		System.out.println(s.getName());
		factory.close();
	}
}
