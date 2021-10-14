package com.company.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entities.Admin;
import com.company.entities.TripBooking;

public interface TripBookingDAO extends JpaRepository<TripBooking, Integer>{

}
