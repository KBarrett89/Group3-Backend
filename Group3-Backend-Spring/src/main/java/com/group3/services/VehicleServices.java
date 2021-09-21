package com.group3.services;

import java.util.List;

import com.group3.data.VehicleRegistration;

public interface VehicleServices {

	public List<VehicleRegistration> getVehicleReg();

	public List<VehicleRegistration> getVehicleRegByPlate(int plate);

}
