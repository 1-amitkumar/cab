package com.company.service;

import java.util.List;

import com.company.Exception.TripBookingException;
import com.company.entities.TripBooking;

public interface ITripBookingService {
	public TripBooking insertTripBooking(TripBooking tripBooking) throws TripBookingException;
	public TripBooking updateTripBooking(TripBooking tripBooking) throws TripBookingException;
	public TripBooking deleteTripBooking(int tripbookingId) throws  TripBookingException;
	public List<TripBooking>viewAllTripsCustomer(int customerId);
	public TripBooking calculateBill(int customerId);
}
