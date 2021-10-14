package com.company.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.Exception.CabException;
import com.company.entities.Cab;
@Service
@Transactional
public class ICabServiceImpl implements ICabService {

	@Override
	public Cab insertCab(Cab cab) throws CabException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cab updateCab(Cab cab) throws CabException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cab deleteCab(int cabId) throws CabException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cab> viewCabsOfType(String carType) throws CabException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCabsOfType(String carType) throws CabException {
		// TODO Auto-generated method stub
		return 0;
	}

}
