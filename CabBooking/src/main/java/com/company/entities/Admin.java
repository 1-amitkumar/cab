package com.company.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin extends User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	
	
	
	public Admin(String username, String password, String address, String mobileNumber, String email, int adminId) {
		super(username, password, address, mobileNumber, email);
		this.adminId = adminId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + "]";
	}
	
	
}
