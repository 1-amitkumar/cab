package com.company.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.Exception.AdminException;
import com.company.entities.Admin;
import com.company.entities.TripBooking;

@Service
@Transactional
public class IAdminServiceImpl implements IAdminService {

	@Override
	public Admin insertAdmin(Admin admin) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin updateAdmin(Admin admin) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin deleteAdmin(int adminId) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdmin(int adminid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getAllTrips(int customerId) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsCabwise() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsCustomerwise() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getTripsDatewise() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate)
			throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

}
