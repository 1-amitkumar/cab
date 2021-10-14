package com.company.service;

import java.util.List;

import com.company.Exception.CabException;
import com.company.entities.Cab;

public interface ICabService {
	public Cab insertCab(Cab cab) throws CabException;
	public Cab updateCab(Cab cab) throws CabException;
	public Cab deleteCab(int cabId) throws CabException;
	public List<Cab> viewCabsOfType(String carType) throws CabException;
	public int countCabsOfType(String carType) throws CabException ;
}
