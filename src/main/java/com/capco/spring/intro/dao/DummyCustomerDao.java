package com.capco.spring.intro.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capco.spring.intro.entity.Customer;

@Repository(value="customerDao")
public class DummyCustomerDao implements CustomerDao{

	private List<Customer> dummyList;
	
	public DummyCustomerDao() {
		dummyList = new ArrayList<Customer>();
		dummyList.add(new Customer(1L, "Janko", "Mrkvicka", "Novaky"));
	}

	@Override
	public List<Customer> getCustomers() {
		return dummyList;
	}
}
