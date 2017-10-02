package com.atuldwivedi.carcentre.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCarIdentity {
	public static void main(String[] args) {

		SessionFactory sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Car_Identity.class)
				.buildSessionFactory();
		
		try{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			Car_Identity car = new Car_Identity("HondaJazz", "Green");
			session.save(car);
			
			session.getTransaction().commit();
		}
		finally {
			sessionFactory.close();
		}
	}
}
