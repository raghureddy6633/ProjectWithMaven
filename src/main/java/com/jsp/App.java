package com.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory factory = new Configuration().configure("com/jsp/hibernate.cfg.xml").buildSessionFactory();
		System.out.println("session factory object :" + factory);
		Student s = new Student();
		s.setId(115);
		s.setStudentName("Vinay Reddy");
		s.setAge(24);
		s.setCity("Suryapeta");
		System.out.println("Student obj :" + s);
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(s);
		txn.commit();
		session.clear();

	}
}
