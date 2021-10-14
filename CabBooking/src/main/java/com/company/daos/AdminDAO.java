package com.company.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entities.Admin;

public interface AdminDAO extends JpaRepository<Admin, Integer>{

}
