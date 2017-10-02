package com.atuldwivedi.carcentre.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryTheCar {
	public static void main(String[] args) {

		SessionFactory sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Car.class)
				.buildSessionFactory();
		
		try{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
//			List<Car> cars = session.createQuery("from Car c where c.name = 'HondaJazz1'").getResultList();
//			List<Car> cars = session.createQuery("from Car c where c.name = 'HondaJazz' OR c.color = 'Red'").getResultList();
			List<Car> cars = session.createQuery("from Car c where c.name LIKE 'Honda%'").getResultList();
			System.out.println(cars.size());
			System.out.println(cars);
			
			session.getTransaction().commit();
		}
		finally {
			sessionFactory.close();
		}
	}
}
