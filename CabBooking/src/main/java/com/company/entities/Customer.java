package com.company.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer extends User{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String username, String password, String address, String mobileNumber, String email,int customerId) {
		super(username, password, address, mobileNumber, email);
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]";
	}
	
	
}
