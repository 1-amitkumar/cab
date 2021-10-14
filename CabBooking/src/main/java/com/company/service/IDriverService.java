package com.company.service;

import java.util.List;

import com.company.Exception.DriverException;
import com.company.entities.Driver;

public interface IDriverService {
	public Driver insertDriver(Driver driver) throws DriverException;
	public Driver updateDriver(Driver driver) throws DriverException;
	public Driver deleteDriver(int driverId) throws DriverException;
	public List<Driver>viewBestDrivers();
	public Driver viewDriver(int driverId);
}
