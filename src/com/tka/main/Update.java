package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.song;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(song.class);
		
		SessionFactory factory=config.buildSessionFactory();
		
	    Session	session=factory.openSession();
	    
	    //data coming from front-end 
	    int id=1;
	    String name="jara shor";
	    
	    session.beginTransaction();
	    
	    //we can get particular record
	    song s=(song)session.get(song.class, 1);
	    
	    s.setname(name);
	    
	    //session.update(s);
	    session.merge(s);
	 
	    System.out.println(s);
	   
	   session.getTransaction().commit();
	   session.close();
	    
		
	}

}
