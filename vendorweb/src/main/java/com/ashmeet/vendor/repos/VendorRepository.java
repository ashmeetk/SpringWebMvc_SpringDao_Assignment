package com.ashmeet.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ashmeet.vendor.entities.Vendor;

@Component
public interface VendorRepository  extends JpaRepository<Vendor, Integer>{

}
