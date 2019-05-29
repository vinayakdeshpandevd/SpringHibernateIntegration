package com.vinayak.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinayak.model.TTEmployee;

@Repository
public class TTEmployeeDaoImpl implements TTEmployeeDao {
	@Autowired
    SessionFactory sessionFactory;
	public TTEmployee addEmployee(TTEmployee empl) {
		
		System.out.println("Dao class");
		
		Session session = null;
		
		System.out.println(" SessionFactory obj = "+sessionFactory);
		
		session = sessionFactory.openSession();
		
		System.out.println("Session obj = "+session);
		
		
		Transaction trnx = session.beginTransaction();
		
		session.save(empl);
		
		trnx.commit();
		
		session.close();
		return null;
	}

	public List<TTEmployee> viewEmployee() {
		 List<TTEmployee> list=new ArrayList();
		 Session session = null;
		 session = sessionFactory.openSession();
		  Query q=session.createQuery("from TTEmployee");
		  
		  list=q.list();
		 System.out.println("list");
		 session.close();
		return list;
	}

	 
	

	 

	public int deleteEmployee(int primary) {
		Session session = null;
		session = sessionFactory.openSession();

		Transaction trnx = session.beginTransaction();
		
		TTEmployee employee =   (TTEmployee) session.get(TTEmployee.class, primary);
		
		session.delete(employee);
		
		trnx.commit();
		
		 
		session.close();
		 
		return 0;
	 
		
	}

	public TTEmployee getObject(int primary) {
		Session session = null;
		session = sessionFactory.openSession();

		Transaction trnx = session.beginTransaction();
		
		TTEmployee employee =   (TTEmployee) session.get(TTEmployee.class, primary);
		return employee;
	}

	public int updateEmployee(TTEmployee employee) {
		Session session = null;
		session = sessionFactory.openSession();

		Transaction trnx = session.beginTransaction();
	 
	 
		session.update(employee);
		session.flush();
		trnx.commit();
		
		 
		session.close();
		 
		return 0;
	}

}
