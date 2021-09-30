package com.group3.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.group3.data.InfoDTO;
import com.group3.services.VehicleServices;

@RestController
@CrossOrigin

public class VehicleRegController {

	private VehicleServices regServices;

	public VehicleRegController(VehicleServices regServices) {
		this.regServices = regServices;
	}

	@GetMapping("/getVehicleRegByPlate/{plate}")
	public InfoDTO getVehicleRegByPlate(@PathVariable String plate) {
		System.out.println(plate);
		return regServices.getVehicleRegByPlate(plate);
	}

}
