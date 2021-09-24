package com.group3.data;

import java.time.LocalDateTime;

public class Scenario3DTO {

	List<suspectProfileDTO>;
	suspectProfileDTO {

	private String forename;
	private String surname;
	private String address;
	private String phoneNumber;
	private String dateOfBirth;
	private String placeOfBirth;
	private Long citizenID;
	private String driverLicenceID;
	}

	List<vehicleSightingsDTO> 
	vehicleSightingsDTO {

	private String streetName;
	private LocalDateTime timeStamp;
	private Double latitude;
	private Double longitude;
	}

	List<vehicleProfileDTO> 
	vehicleProfileDTO {

	private Long vehicleRegistrationNO;
	private Long registrationID;
	private String registrationDate;
	private String make;
	private String model;
	private String colour;
	}

	public Scenario3DTO(String forename, String surname, String address, String phoneNumber, String dateOfBirth,
			String placeOfBirth, Long citizenID, String driverLicenceID, String streetName, LocalDateTime timeStamp, 
			Double latitude, Double longitude, Long vehicleRegistrationNO, Long registrationID, String registrationDate,  
			String make,String model, String colour) {
		

		super();
		
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.citizenID = citizenID;
		this.driverLicenceID = driverLicenceID;
		
		this.streetName = streetName;
		this.timeStamp = timeStamp;
		this.latitude = latitude;
		this.longitude = longitude;
		
		this.vehicleRegistrationNO = vehicleRegistrationNO;
		this.registrationID = registrationID;
		this.registrationDate = registrationDate;
		this.make = make;
		this.model = model;
		this.colour = colour;
		
		
	}

	public Scenario3DTO() {

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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public Long getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(Long citizenID) {
		this.citizenID = citizenID;
	}
	public String getDriverLicenceID() {
		return driverLicenceID;
	}

	public void setDriverLicenceID(String driverLicenceID) {
		this.driverLicenceID = driverLicenceID;
	}
	
	
	
	
	
	
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
	
	
	
	public Long getVehicleRegistrationNO() {
		return vehicleRegistrationNO;
	}

	public void setVehicleRegistrationNO(Long vehicleRegistrationNO) {
		this.vehicleRegistrationNO = vehicleRegistrationNO;
	}
	
	public Long getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(Long registrationID) {
		this.registrationID = registrationID;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
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

