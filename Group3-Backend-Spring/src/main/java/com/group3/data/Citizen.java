package com.group3.data;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long citizenID;
	private String placeOfBirth;
	private String forename;
	private String surname;
	private String homeAddress;
	private LocalDateTime dateOfBirth;
	private String sex;

	public Citizen(Long citizenID, String placeOfBirth, String forename, String surname, LocalDateTime dateOfBirth,
			String sex, String homeAddress) {
		super();
		this.citizenID = citizenID;
		this.placeOfBirth = placeOfBirth;
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.homeAddress = homeAddress;
	}

	public Citizen(String placeOfBirth, String forename, String surname, LocalDateTime dateOfBirth, String sex,
			String homeAddress) {
		super();
		this.placeOfBirth = placeOfBirth;
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
		this.homeAddress = homeAddress;
	}

	public Citizen() {

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

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
