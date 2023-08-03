package com.ashmeet.vendor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashmeet.vendor.entities.Vendor;
import com.ashmeet.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepository repository;

	@Override
	public Vendor createVendor(Vendor vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendor getVendorById(int id) {
		 Optional<Vendor> optionalVendor = repository.findById(id);
		 if(optionalVendor.isPresent())
			 return optionalVendor.get();
		 else
			 return new Vendor();
	}

	@Override
	public List<Vendor> getAllVendors() {
		return repository.findAll();
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		repository.delete(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return repository.save(vendor);
	}

}
