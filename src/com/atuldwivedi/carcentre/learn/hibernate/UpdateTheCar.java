package com.atuldwivedi.carcentre.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateTheCar {
	public static void main(String[] args) {

		SessionFactory sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Car.class)
				.buildSessionFactory();
		 
		try{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			Car car = session.get(Car.class, 1001l);
			car.setName("HondaMaze V2");
			session.getTransaction().commit();
		}
		finally {
			sessionFactory.close();
		}
	}
}
