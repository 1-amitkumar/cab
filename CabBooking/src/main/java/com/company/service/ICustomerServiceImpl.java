package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.Exception.CustomerException;
import com.company.daos.CustomerDAO;
import com.company.entities.Customer;
@Service
@Transactional
public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	CustomerDAO custDao;
	
	@Override
	public Customer insertCustomer(Customer customer) throws CustomerException {
		if(custDao.existsById(customer.getCustomerId())) {
			throw new CustomerException("customer alredy exists");
		}
		return custDao.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		if(custDao.existsById(customer.getCustomerId())) {
			return custDao.save(customer);
		}
		throw new CustomerException("customer Not Found");
	}

	@Override
	public Customer deleteCustomer(int customerId) throws CustomerException {
		if(custDao.existsById(customerId)) {
		Customer cbean=custDao.getById(customerId);
		custDao.delete(cbean);
		return cbean;
		}
		throw new CustomerException("customer Not Found");
	}

	@Override
	public Customer viewCustomer(int customerId) {
		Customer cbean=custDao.findById(customerId).get();
		return cbean;
		}

	@Override
	public List<Customer> viewAllCustomers() {
		List<Customer> cbean=custDao.findAll();
		return cbean;
	}

	@Override
	public Customer validateCustomer(String username, String password) throws CustomerException{
		Customer cust = custDao.findByUsername(username);
		if(password.equals(cust.getPassword()))
		return cust;
		throw new CustomerException("customer Not Found");
	}

}
