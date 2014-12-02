package com.capco.spring.intro.dao;

import java.util.ArrayList;
import java.util.List;

import com.capco.spring.intro.entity.Customer;


public class DummyCustomerDao implements CustomerDao{

	private List<Customer> dummyList;
	
	public DummyCustomerDao() {
		dummyList = new ArrayList<Customer>();
	}
	
	public void setDummyList(List<Customer> dummyList) {
		this.dummyList = dummyList;
	}
	
	public List<Customer> getDummyList() {
		return dummyList;
	}
}
