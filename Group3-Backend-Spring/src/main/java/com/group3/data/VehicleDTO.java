package com.group3.data;

import java.time.LocalDateTime;

public class VehicleDTO {

	private String vehicleRegistrationNO;
	private Long registrationID;
	private LocalDateTime registrationDate;
	private String make;
	private String model;
	private String colour;

	public VehicleDTO(String vehicleRegistrationNO, Long registrationID, LocalDateTime registrationDate, String make,
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

	public Long getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(Long registrationID) {
		this.registrationID = registrationID;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
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
