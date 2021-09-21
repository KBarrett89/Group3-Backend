package com.group3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.group3.data.VehicleRegistration;

@Service
public class VehicleRegDB implements VehicleServices {

	@Override
	public List<VehicleRegistration> getVehicleReg() {
		VehicleRegistration vehicleReg = new VehicleRegistration();
		List<VehicleRegistration> regList = new ArrayList<>();
		regList.add(vehicleReg);
		return regList;

	}

	@Override
	public List<VehicleRegistration> getVehicleRegByPlate(int plate) {
		return null;

	}

}
