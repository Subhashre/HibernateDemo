package com.subha.org.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.subha.org.dto.UserDetails;

@Controller
public class HibernateTest {
	
	@Autowired
	UserDetails details;
	@Autowired
	Configuration configuration;


	public void setUserDetails() {
		details.setUserId(1);
		details.setUserName("Barsha");

		SessionFactory factory = configuration.configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(details);
		session.getTransaction().commit();
		
	}

}
