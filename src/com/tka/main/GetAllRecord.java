package com.tka.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.tka.entity.song;

//import jakarta.persistence.Query;



public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(song.class);
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
	
	    session.beginTransaction();
		
		String hqlquery="from song";
	   // Query query=session.createQuery(hqlquery, song.class);
	    
       //  List<song> list= query.getResultList();
		
		Query query=session.createQuery(hqlquery, song.class);
	    List<song> list= query.list();
	  
	    
         
         for(song song:list) {
        	 
        	 System.out.println(song);
         }
         
         session.getTransaction().commit();
         session.close();
	
		}
		
	}


