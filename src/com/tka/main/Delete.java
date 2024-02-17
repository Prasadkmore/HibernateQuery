package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.song;

public class Delete {

	public static void main(String[] args) {
	
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(song.class);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session =factory.openSession();
		
		int id=4;
		
		session.beginTransaction();
		
		song s=(song)session.get(song.class, id);
	
		
		//session.delete(s);
		session.remove(s);
		System.out.println("delete record");
		
		
		
		session.getTransaction().commit();
		session.close();
		
	}
}
