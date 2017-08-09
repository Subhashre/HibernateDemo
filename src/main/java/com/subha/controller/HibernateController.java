package com.subha.controller;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subha.org.hibernate.HibernateTest;

@RestController
public class HibernateController {

	@Autowired
	HibernateTest hibernateTest;
	
	@RequestMapping("/userdetails")
	@GET
	public void savaObject() {
		hibernateTest.setUserDetails();
	}
}
