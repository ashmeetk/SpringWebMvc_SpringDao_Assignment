package com.ashmeet.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashmeet.vendor.entities.Vendor;
import com.ashmeet.vendor.service.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	VendorService service;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createVendor";
	}
	
	@RequestMapping("/saveVen")
	public String SaveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap)
	{
		Vendor savedVendor = service.createVendor(vendor);
		String msg = "Vendor saved with id: " + savedVendor.getId();
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}

	@RequestMapping("/displayVendors")
	public String displayVendors(ModelMap modelMap)
	{
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap)
	{
		Vendor vendor = service.getVendorById(id);
		service.deleteVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
	@RequestMapping("showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap)
	{
		Vendor vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "updateVendor";
	}
	
	@RequestMapping("updateVen")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap)
	{
		int id = vendor.getId();
		System.out.println("id is: " + id);
		System.out.println("Vendor returned is: " + vendor);
		System.out.println("Vendor is: " + service.getVendorById(id));
		service.deleteVendor(service.getVendorById(id));
		service.createVendor(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendors";
	}
	
}
