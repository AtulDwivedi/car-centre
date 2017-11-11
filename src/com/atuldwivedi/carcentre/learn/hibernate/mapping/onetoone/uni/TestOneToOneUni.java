package com.atuldwivedi.carcentre.learn.hibernate.mapping.onetoone.uni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOneUni {

	private static SessionFactory sessionFactory;

	private static Session session;

	public static void main(String[] args) {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car.class)
				.addAnnotatedClass(CarDetail.class).buildSessionFactory();
		session = sessionFactory.getCurrentSession();

		 saveTheCar();
//		 getAllCars();
//		 getCar();
//		 deleteTheCar();
	}

	private static void deleteTheCar() {
		try {

			// begin the transaction
			session.beginTransaction();

			// perform the transaction
			Car car = session.get(Car.class, 1l);
			session.delete(car);

			
//			 CarDetail carDtl = session.get(CarDetail.class, 2l);
//			 session.delete(carDtl);
			 

			// submit/finish the transaction
			session.getTransaction().commit();

		} finally {
			session.close();
			sessionFactory.close();
		}
	}

	private static void getCar() {
		try {

			// begin the transaction
			session.beginTransaction();

			// perform the transaction
			Car car = session.get(Car.class, 1l);
			System.out.println(car);

			// submit/finish the transaction
			session.getTransaction().commit();

		} finally {
			session.close();
			sessionFactory.close();
		}
	}

	private static void getAllCars() {
		try {

			// begin the transaction
			session.beginTransaction();

			// perform the transaction
			List<Car> cars = session.createQuery("from Car").getResultList();
			System.out.println(cars);

			// submit/finish the transaction
			session.getTransaction().commit();

		} finally {
			session.close();
			sessionFactory.close();
		}
	}

	private static void saveTheCar() {
		try {
			CarDetail carDetail = new CarDetail("Black", 33.6d, true);
			Car car = new Car("Honda City", carDetail);

			// begin the transaction
			session.beginTransaction();

			// perform the transaction
			session.save(car);

			// submit/finish the transaction
			session.getTransaction().commit();

		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
