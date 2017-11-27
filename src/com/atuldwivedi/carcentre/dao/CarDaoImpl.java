package com.atuldwivedi.carcentre.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atuldwivedi.carcentre.domain.HondaCity;

public class CarDaoImpl implements CarDao {

	SessionFactory sessionFactory;
	Session session;

	@Override
	public Long addCar(HondaCity hondaCity) {
		Long retVal = null;

		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(HondaCity.class)
					.buildSessionFactory();
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			retVal = (Long) session.save(hondaCity);
			session.getTransaction().commit();
		} finally {
			session.close();
			sessionFactory.close();
		}

		return retVal;
	}

	@Override
	public List<HondaCity> getCars() {
		List<HondaCity> retVal = null;
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(HondaCity.class)
					.buildSessionFactory();
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			retVal = session.createQuery("from HondaCity").getResultList();
			session.getTransaction().commit();
		} finally {
			session.close();
			sessionFactory.close();
		}

		return retVal;
	}

}
