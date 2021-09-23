package com.group3.data;

import java.time.LocalDateTime;

public class InfoDTO {

	private Long registrationID;
	private String registrationDate;
	private Long vehicleRegistrationNO;
	private String make;
	private String model;
	private String colour;
	private String forename;
	private String surname;
	private String address;
	private String dateOfBirth;
	private String driverLicenceID;

	private String phoneNumber;

	private Long citizenID;
	private String placeOfBirth;

	private Integer ANPRPointId;
	private LocalDateTime timeStamp;

	private String streetName;
	private Double latitude;
	private Double longitude;

	public InfoDTO(Long registrationID, String registrationDate, Long vehicleRegistrationNO, String make, String model,
			String colour, String forename, String surname, String address, String dateOfBirth, String driverLicenceID,
			String phoneNumber, Long citizenID, String placeOfBirth, Integer ANPRPointId, LocalDateTime timeStamp,
			String streetName, Double latitude, Double longitude) {

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
		this.phoneNumber = phoneNumber;
		this.citizenID = citizenID;
		this.placeOfBirth = placeOfBirth;
		this.ANPRPointId = ANPRPointId;
		this.timeStamp = timeStamp;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public InfoDTO() {

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

	public Long getVehicleRegistrationNO() {
		return vehicleRegistrationNO;
	}

	public void setVehicleRegistrationNO(Long vehicleRegistrationNO) {
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getCitizenID() {
		return citizenID;
	}

	public void setCitizenID(Long citizenID) {
		this.citizenID = citizenID;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public Integer getANPRPointId() {
		return ANPRPointId;
	}

	public void setANPRPointId(Integer aNPRPointId) {
		ANPRPointId = aNPRPointId;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

}
