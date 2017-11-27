package com.atuldwivedi.carcentre.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atuldwivedi.carcentre.user.Customer;

public class CustomerDaoImpl implements CustomerDao {

	SessionFactory sessionFactory;
	Session	session;
	
	@Override
	public Long addCustomer(Customer customer) {
		
		System.out.println("customerdaolmpl "+customer);
		
		Long returnVal = null;
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class).buildSessionFactory();
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			returnVal = (Long)session.save(customer);
			
			session.getTransaction().commit();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
			sessionFactory.close();
		}
		
		
		return returnVal;
	}

	@Override
	public Long editCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(Long ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
