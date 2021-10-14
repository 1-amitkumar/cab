package com.company.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.Exception.DriverException;
import com.company.entities.Driver;
@Service
@Transactional
public class IDriverServiceImpl implements IDriverService {

	@Override
	public Driver insertDriver(Driver driver) throws DriverException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver updateDriver(Driver driver) throws DriverException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver deleteDriver(int driverId) throws DriverException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Driver> viewBestDrivers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver viewDriver(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}

}
