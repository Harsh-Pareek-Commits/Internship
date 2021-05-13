package com.capg.jpa.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainClass {
	static Configuration cfg = new Configuration();
	static SessionFactory factory = cfg.configure().buildSessionFactory();
	static Session session = factory.openSession();// jdbc -> coonection object

	public static void main(String[] args) {
		MainClass m = new MainClass();
		m.insert_data();
	}

	public void insert_data() {
		Transaction t = session.beginTransaction();

		// ---- write code for data base operation ----

		Student std = new Student();
		std.setName("Ram");
		std.setMarks(80);
		Certify c = new Certify("Java Boot camp", "NHCE");

		std.setTechnical(c);

		Certify c2 = new Certify("NCC camp", "NHC");
		std.setNon_technical(c2);
		session.save(std); // insert into Account .....

		System.out.println("  -->> Data Saved ..");
		t.commit();

		session.close();
		System.out.println("All Done");

	}

}
