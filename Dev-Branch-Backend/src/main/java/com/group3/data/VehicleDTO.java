package com.group3.data;

import java.sql.Date;

public class VehicleDTO {

	private String vehicleRegistrationNO;
	private int registrationID;
	private Date registrationDate;
	private String make;
	private String model;
	private String colour;

	public VehicleDTO(String vehicleRegistrationNO, int registrationID, Date registrationDate, String make,
			String model, String colour) {
		super();
		this.vehicleRegistrationNO = vehicleRegistrationNO;
		this.registrationID = registrationID;
		this.registrationDate = registrationDate;
		this.make = make;
		this.model = model;
		this.colour = colour;
	}

	public VehicleDTO() {

	}

	public String getVehicleRegistrationNO() {
		return vehicleRegistrationNO;
	}

	public void setVehicleRegistrationNO(String vehicleRegistrationNO) {
		this.vehicleRegistrationNO = vehicleRegistrationNO;
	}

	public int getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(int registrationID) {
		this.registrationID = registrationID;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
