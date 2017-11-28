package com.atuldwivedi.carcentre.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atuldwivedi.carcentre.domain.EmployeeRegistration;


public class EmployeeDaoImpl implements EmployeeDao {
	
	SessionFactory sessionFactory;
	Session session;

	@Override
	public Long addEmployee(EmployeeRegistration employeeregistration) {
		Long retVal = null;
		try {			
		sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeRegistration.class)
				.buildSessionFactory();		
		session= sessionFactory.getCurrentSession();		
		session.beginTransaction();		
		retVal=(Long) session.save(employeeregistration);		
		session.getTransaction().commit();
		}finally {
			session.close();
			sessionFactory.close();
		}
		return retVal;
	}

	@Override
	public List<EmployeeRegistration> getEmployee() {
		List<EmployeeRegistration> retVal = null;
		try {
		sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeRegistration.class)
				.buildSessionFactory();
		session= sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		retVal = session.createQuery("from EmployeeRegistration").getResultList();
		session.getTransaction().commit();	
	
} finally {
	session.close();
	sessionFactory.close();
}
		return retVal;		 		

}
	
}
