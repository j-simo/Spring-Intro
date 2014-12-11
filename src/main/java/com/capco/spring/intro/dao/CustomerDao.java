package com.capco.spring.intro.dao;

import java.util.List;

import com.capco.spring.intro.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomers();
}
