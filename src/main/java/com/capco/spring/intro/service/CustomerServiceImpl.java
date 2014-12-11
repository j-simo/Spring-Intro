package com.capco.spring.intro.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capco.spring.intro.dao.CustomerDao;
import com.capco.spring.intro.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;

	@PostConstruct
	public void init() {
		System.out.println("Initialization of CustomerServiceImpl");
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getCustomers();
	}
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
}
