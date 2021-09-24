package com.group3.data;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ANPRObservations {

	@Id
	private Long ANPRPointId;
	private LocalDateTime timeStamp;
	private String vehicleRegistrationNumber;

	public ANPRObservations(Long ANPRPointId, LocalDateTime timeStamp, String vehicleRegistrationNumber) {
		super();
		this.ANPRPointId = ANPRPointId;
		this.timeStamp = timeStamp;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public ANPRObservations(LocalDateTime timeStamp, String vehicleRegistrationNumber) {
		super();
		this.timeStamp = timeStamp;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public ANPRObservations() {

	}

	public Long getANPRPointId() {
		return ANPRPointId;
	}

	public void setANPRPointId(Long ANPRPointId) {
		this.ANPRPointId = ANPRPointId;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}

	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

}
