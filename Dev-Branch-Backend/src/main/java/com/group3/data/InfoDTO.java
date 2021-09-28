package com.group3.data;

import java.util.List;

public class InfoDTO {

	private PersonDTO person;
	private List<SightingDTO> sightingList;
	private VehicleDTO vehicle;

	public InfoDTO(PersonDTO person, List<SightingDTO> sightingList, VehicleDTO vehicle) {
		super();
		this.person = person;
		this.sightingList = sightingList;
		this.vehicle = vehicle;
	}

	public InfoDTO() {

	}

	public PersonDTO getPerson() {
		return person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

	public List<SightingDTO> getSightingList() {
		return sightingList;
	}

	public void setSightingList(List<SightingDTO> sightingList) {
		this.sightingList = sightingList;
	}

	public VehicleDTO getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}

}
