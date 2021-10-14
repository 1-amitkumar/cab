package com.company.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entities.Admin;
import com.company.entities.Customer;
import java.lang.String;
import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer, Integer>{
	Customer findByUsername(String username);
	
}
