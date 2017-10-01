package com.atuldwivedi.carcentre.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateHelloWorld {
	public static void main(String[] args) {

		SessionFactory sessionFactory =  new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Car.class)
				.buildSessionFactory();
		
		try{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
//			Car car = new Car(1002l, "HondaAmaze", "Black");
//			session.save(car);
//			Car car = session.get(Car.class, 1001);
//			System.out.println(car.getName());
			
			List<Car> cars = session.createQuery("from Car").getResultList();
			System.out.println(cars);
			
			session.getTransaction().commit();
		}
		finally {
			sessionFactory.close();
		}
	}
}
