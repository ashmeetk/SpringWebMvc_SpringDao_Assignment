package com.ashmeet.vendor.service;

import java.util.List;

import com.ashmeet.vendor.entities.Vendor;

public interface VendorService {
	
	Vendor createVendor(Vendor vendor);
	
	Vendor getVendorById(int id);
	
	List<Vendor> getAllVendors();
	
	void deleteVendor(Vendor vendor);
	
	Vendor updateVendor(Vendor vendor);

}
