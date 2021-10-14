package com.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.Exception.CustomerException;
import com.company.entities.Customer;
import com.company.service.ICustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	ICustomerServiceImpl customerService;
	
	Customer cust;
	
	//working
	@PostMapping("/addcustomer")
	public Customer inserCustomer(@RequestBody Customer customer)throws CustomerException {
		return customerService.insertCustomer(customer);
	}
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer)throws CustomerException  {
			cust = customerService.updateCustomer(customer);
			//if(cust!=null)
				return cust;
			//throw new CustomerException("Customer does not exist");
	}
	@DeleteMapping("/remove/{cid}")
	public Customer deleteCustomer(@PathVariable("cid") String cid) throws CustomerException  {
		cust = customerService.deleteCustomer(Integer.parseInt(cid));
		if(cust!=null) {	
			cust =  customerService.deleteCustomer(Integer.parseInt(cid));
			return cust;
		}
		return cust;
	//	throw new CustomerException("Customer does not exist");
	}
	
	//working
	@GetMapping("/viewcustomer/{cid}")
	public Customer viewCust(@PathVariable("cid") String cid) {
		Customer cust = customerService.viewCustomer(Integer.parseInt(cid));
		return cust;
}
}
