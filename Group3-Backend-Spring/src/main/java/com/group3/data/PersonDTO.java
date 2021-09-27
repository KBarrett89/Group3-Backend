package com.group3.data;

import java.sql.Date;

public class PersonDTO {

	private String forename;
	private String surname;
	private String address;
	private String phoneNumber;
	private Date dateOfBirth;
	private String placeOfBirth;
	private Long citizenID;
	private String driverLicenceID;

	public PersonDTO(String forename, String surname, String address, String phoneNumber, Date dateOfBirth,
			String placeOfBirth, Long citizenID, String driverLicenceID) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.citizenID = citizenID;
		this.driverLicenceID = driverLicenceID;
	}

	public PersonDTO() {

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
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

}
