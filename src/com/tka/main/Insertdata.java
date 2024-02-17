package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.song;

public class Insertdata {

	// insert data with the help of hibernate
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(song.class);
		
		SessionFactory factory =config.buildSessionFactory();
		
      	Session session=factory.openSession();
      	
      	song s=new song();
      
      	s.setname("navin popat");
      	s.setsinger("anand shinde");
      	
      	session.beginTransaction();
      	session.persist(s);
      	session.getTransaction().commit();
      	session.close();
	}

}
