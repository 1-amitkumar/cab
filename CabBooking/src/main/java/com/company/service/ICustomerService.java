package com.company.service;

import java.util.List;

import com.company.Exception.CustomerException;
import com.company.entities.Customer;

public interface ICustomerService {

	public Customer insertCustomer(Customer customer) throws CustomerException;
	public Customer updateCustomer(Customer customer) throws CustomerException;
	public Customer deleteCustomer(int customerId) throws CustomerException;
	public Customer viewCustomer(int customerId);
	public List<Customer> viewAllCustomers();
	public Customer validateCustomer(String username,String password) throws CustomerException;
}
