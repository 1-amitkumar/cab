package com.company.service;

import java.time.LocalDateTime;
import java.util.List;

import com.company.Exception.AdminException;
import com.company.entities.Admin;
import com.company.entities.TripBooking;

public interface IAdminService {
	public Admin insertAdmin(Admin admin) throws  AdminException;
	public Admin updateAdmin(Admin admin) throws AdminException;
	public Admin deleteAdmin(int adminId) throws AdminException;
	public Admin getAdmin(int adminid);
	public List<TripBooking> getAllTrips(int customerId)throws AdminException;;
	public List<TripBooking> getTripsCabwise()throws AdminException;;
	public List<TripBooking> getTripsCustomerwise()throws AdminException;;
	public List<TripBooking> getTripsDatewise()throws AdminException;;
	public List<TripBooking> getAllTripsForDays(int customerId,LocalDateTime fromDate, LocalDateTime toDate)throws AdminException;;
	
}
