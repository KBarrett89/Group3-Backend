package com.group3.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.group3.data.Person;
import com.group3.data.VehicleRegistration;
import com.group3.services.PersonServices;
import com.group3.services.VehicleServices;

@RestController
@CrossOrigin
public class VehicleRegController {

	private PersonServices services;
	private VehicleServices regServices;

	public VehicleRegController(PersonServices services, VehicleServices regServices) {
		this.services = services;
		this.regServices = regServices;
	}

	@GetMapping("/getPerson")
	public List<Person> getPerson() {
		return services.getPerson();
	}

	@GetMapping("/getPersonWithPlate/{id}")
	public List<Person> getPersonWithPlate(@PathVariable int id) {
		return services.getPersonWithPlate(id);
	}

	@GetMapping("/getVehicleReg")
	public List<VehicleRegistration> getVehicleReg() {
		return regServices.getVehicleReg();
	}

	@GetMapping("/getVehicleRegByPlate/{plate}")
	public List<VehicleRegistration> getVehicleRegByPlate(@PathVariable int plate) {
		return regServices.getVehicleRegByPlate(plate);
	}

}
