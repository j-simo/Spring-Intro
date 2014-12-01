package com.capco.spring.intro.dao;

import java.util.ArrayList;
import java.util.List;

import com.capco.spring.entity.Customer;


public class DummyCustomerDao implements CustomerDao{

	private List<Customer> dummyList;
	
	public DummyCustomerDao() {
		dummyList = new ArrayList<Customer>();
	}
}
