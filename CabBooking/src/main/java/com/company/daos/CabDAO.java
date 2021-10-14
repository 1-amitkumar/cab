package com.company.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entities.Admin;
import com.company.entities.Cab;

public interface CabDAO extends JpaRepository<Cab, Integer>{

}
