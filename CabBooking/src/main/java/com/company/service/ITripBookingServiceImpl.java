package com.company.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.Exception.TripBookingException;
import com.company.entities.TripBooking;
@Service
@Transactional
public class ITripBookingServiceImpl implements ITripBookingService {

	@Override
	public TripBooking insertTripBooking(TripBooking tripBooking) throws TripBookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking) throws TripBookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripBooking deleteTripBooking(int tripbookingId) throws TripBookingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBooking> viewAllTripsCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripBooking calculateBill(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
