package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

import com.tka.entity.song;

import jakarta.persistence.Query;

public class GetParticularRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Configuration config=new Configuration();
	    config.configure("hibernate.cfg.xml");
	    config.addAnnotatedClass(song.class);
	    
	    SessionFactory factory= config.buildSessionFactory();
	    
	   Session session= factory.openSession();
	   
	   session.beginTransaction();
	   
	   int id=5;
	   
	   String hqlquery="from song where id=:myid";
	   Query query= session.createQuery(hqlquery, song.class);
	   
	   query.setParameter("myid", id);
	   song song=(song)query.getSingleResult();
	   
      // song song = query.uniqueResult();
       System.out.println(song);
       session.getTransaction().commit();;
       session.close();
		
	}

}
