package com.atuldwivedi.carcentre.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atuldwivedi.carcentre.user.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Long addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		Long pk = (Long) session.save(customer);
		return pk;
	}
	
	@Override
	public void addOrupdateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	public Long addCustomerOld(Customer customer) {

		System.out.println("customerdaolmpl " + customer);
		Session session = null;
		Long returnVal = null;
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
					.buildSessionFactory();
			session = sessionFactory.getCurrentSession();

			session.beginTransaction();

			returnVal = (Long) session.save(customer);

			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
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
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, ID);
	}

	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		List<Customer> customers = session.createQuery("from Customer order by id").getResultList();
		return customers;
	}

	@Override
	public void deleteCustomer(Long customerId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("DELETE FROM Customer WHERE customerID=:customerID");
		query.setParameter("customerID", customerId);
		query.executeUpdate();
	}

}
