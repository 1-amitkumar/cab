package com.company.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Driver extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int driverId;

	private String lisenceNo;
	
	private float rating ;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Cab cab;
	
	
	@OneToMany(mappedBy = "driver")
	private List<TripBooking> tripBookingList = new ArrayList<TripBooking>();
	
	public Driver(String username, String password, String address, String mobileNumber, String email, int driverId,
			String lisenceNo, float rating, Cab cab) {
		super(username, password, address, mobileNumber, email);
		this.driverId = driverId;
		this.lisenceNo = lisenceNo;
		this.rating = rating;
		this.cab = cab;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getLisenceNo() {
		return lisenceNo;
	}

	public void setLisenceNo(String lisenceNo) {
		this.lisenceNo = lisenceNo;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public List<TripBooking> getTripBookingList() {
		return tripBookingList;
	}

	public void setTripBookingList(List<TripBooking> tripBookingList) {
		this.tripBookingList = tripBookingList;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", lisenceNo=" + lisenceNo + ", rating=" + rating + ", cab=" + cab
				+ ", tripBookingList=" + tripBookingList + "]";
	}
	
	
	
}
