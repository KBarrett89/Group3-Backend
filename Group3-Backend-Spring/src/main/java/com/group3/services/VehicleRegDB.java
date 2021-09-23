package com.group3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group3.data.VehicleRegistration;
import com.group3.data.repos.DataRepo;

@Service
public class VehicleRegDB implements VehicleServices {

	private DataRepo repo;

	@Autowired
	public VehicleRegDB(DataRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<VehicleRegistration> getVehicleReg() {
//		Demo Object

		VehicleRegistration vehicleReg = new VehicleRegistration(1000345L, "01/01/2000", 1000234234234243L, "audi", "8",
				"black", "jon", "smith", "1 jonsmith road", "01/01/2000", "300");
		List<VehicleRegistration> regList = new ArrayList<>();
		regList.add(vehicleReg);
		return regList;

//		Reality DB

//		return this.repo.findAll();
	}

	@Override
	public List<VehicleRegistration> getVehicleRegByPlate(int plate) {
//		Demo Object
		VehicleRegistration truReg = null;

		VehicleRegistration vehicleReg = new VehicleRegistration(1000345L, "01/01/2000", 1000234234234243L, "audi", "8",
				"black", "jon", "smith", "1 jonsmith road", "01/01/2000", "300");
		List<VehicleRegistration> regList = new ArrayList<>();
		regList.add(vehicleReg);

//		Reality DB
//		
//		regList = return this.repo.findByVehicleRegistrationNO(plate);

		for (int i = 0; i < regList.size(); i++) {
			if (regList.get(i).getVehicleRegistrationNO() == plate) {
				truReg = regList.get(i);
			}
		}
		String forename = truReg.getForename();
		String surname = truReg.getSurname();

//	    Demo

//		Perform next search

//		Reality DB

//		forenameList = return this.repo.findByNameIgnoreCase(forename);
//		surnameList = return this.repo.findByNameIgnoreCase(surname);

//		then find common denominator

		return null;

	}

}
