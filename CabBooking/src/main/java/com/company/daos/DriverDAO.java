package com.company.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entities.Admin;
import com.company.entities.Driver;

public interface DriverDAO extends JpaRepository<Driver, Integer>{

}
