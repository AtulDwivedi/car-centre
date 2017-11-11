package com.atuldwivedi.carcentre.learn.hibernate.mapping.onetoone.bi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOneBi {

	private static SessionFactory sessionFactory;

	private static Session session;

	public static void main(String[] args) {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Car.class)
				.addAnnotatedClass(CarDetail.class).buildSessionFactory();

		try {
			saveCarOrCarDetail();
			getAllCars();
			getCarOrCarDetail();
			deleteCarOrCarDetail();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}

	private static void saveCarOrCarDetail() {
		Car car = new Car("HondaAmaze");
		CarDetail carDetail = new CarDetail("Black", 33.6d, true);

		car.setCarDetail(carDetail);

		session = sessionFactory.getCurrentSession();
		// begin the transaction
		session.beginTransaction();
		// perform the transaction
		session.save(carDetail);

		// submit/finish the transaction
		session.getTransaction().commit();
	}

	private static void deleteCarOrCarDetail() {

		session = sessionFactory.getCurrentSession();
		// begin the transaction
		session.beginTransaction();

		// perform the transaction
		CarDetail carDetail = session.get(CarDetail.class, 1l);
		session.delete(carDetail);

		// submit/finish the transaction
		session.getTransaction().commit();

	}

	private static void getCarOrCarDetail() {

		session = sessionFactory.getCurrentSession();
		// begin the transaction
		session.beginTransaction();

		// perform the transaction
		CarDetail carDetail = session.get(CarDetail.class, 1l);
		System.out.println(carDetail);
		System.out.println(carDetail.getCar());

		// submit/finish the transaction
		session.getTransaction().commit();

	}

	private static void getAllCars() {
		session = sessionFactory.getCurrentSession();
		// begin the transaction
		session.beginTransaction();

		// perform the transaction
		List<Car> cars = session.createQuery("from Car").getResultList();
		System.out.println(cars);

		// submit/finish the transaction
		session.getTransaction().commit();

	}
}
