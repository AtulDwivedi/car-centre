package com.atuldwivedi.carcentre.learn.hibernate.mapping.onetoone;

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
		session = sessionFactory.getCurrentSession();

//		saveTheCarDetail();
//		getAllCars();
//		getCarDetail();
		deleteTheCarDetail();
	}

	private static void deleteTheCarDetail() {
try {
			
			// begin the transaction
						session.beginTransaction();

						// perform the transaction
						CarDetail carDetail = session.get(CarDetail.class, 2l);
						session.delete(carDetail);

						// submit/finish the transaction
						session.getTransaction().commit();
			
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

	private static void getCarDetail() {
try {
			
			// begin the transaction
						session.beginTransaction();

						// perform the transaction
						CarDetail carDetail = session.get(CarDetail.class, 2l);
						System.out.println(carDetail);
						System.out.println(carDetail.getCar());

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

	private static void saveTheCarDetail() {
		try {
			CarDetail carDetail = new CarDetail("Black", 33.6d, true);
			Car car = new Car();
			car.setName("HondaAmaze");
			carDetail.setCar(car);

			// begin the transaction
			session.beginTransaction();

			// perform the transaction
			session.save(carDetail);

			// submit/finish the transaction
			session.getTransaction().commit();

		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
