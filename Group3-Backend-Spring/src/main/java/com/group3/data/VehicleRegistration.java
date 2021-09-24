package com.group3.data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicleRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long registrationID;
	private LocalDateTime registrationDate;
	private String vehicleRegistrationNO;
	@Column(name = "carMake", unique = true)
	private String make;
	@Column(name = "carModel", unique = true)
	private String model;
	@Column(name = "carColour", unique = true)
	private String colour;
	private String forename;
	private String surname;
	private String address;
	private String dateOfBirth;
	private String driverLicenceID;

	public VehicleRegistration(Long registrationID, LocalDateTime registrationDate, String vehicleRegistrationNO,
			String make, String model, String colour, String forename, String surname, String address,
			String dateOfBirth, String driverLicenceID) {
		super();
		this.registrationID = registrationID;
		this.registrationDate = registrationDate;
		this.vehicleRegistrationNO = vehicleRegistrationNO;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.driverLicenceID = driverLicenceID;
	}

	public VehicleRegistration(LocalDateTime registrationDate, String vehicleRegistrationNO, String make, String model,
			String colour, String forename, String surname, String address, String dateOfBirth,
			String driverLicenceID) {
		super();
		this.registrationDate = registrationDate;
		this.vehicleRegistrationNO = vehicleRegistrationNO;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.driverLicenceID = driverLicenceID;
	}

	public VehicleRegistration() {

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

	public String getVehicleRegistrationNO() {
		return vehicleRegistrationNO;
	}

	public void setVehicleRegistrationNO(String vehicleRegistrationNO) {
		this.vehicleRegistrationNO = vehicleRegistrationNO;
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

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDriverLicenceID() {
		return driverLicenceID;
	}

	public void setDriverLicenceID(String driverLicenceID) {
		this.driverLicenceID = driverLicenceID;
	}

}
