package com.group3.data;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ANPRObservations {

	@Id
	private int ANPRPointId;
	private LocalDateTime timeStamp;
	private String vehicleRegistrationNO;

	@ManyToOne
	private ANPRCamera ANPRCamera;

	public ANPRObservations(int ANPRPointId, LocalDateTime timeStamp, String vehicleRegistrationNO) {
		super();
		this.ANPRPointId = ANPRPointId;
		this.timeStamp = timeStamp;
		this.vehicleRegistrationNO = vehicleRegistrationNO;
	}

	public ANPRObservations(LocalDateTime timeStamp, String vehicleRegistrationNO) {
		super();
		this.timeStamp = timeStamp;
		this.vehicleRegistrationNO = vehicleRegistrationNO;
	}

	public ANPRObservations() {

	}

	public int getANPRPointId() {
		return ANPRPointId;
	}

	public void setANPRPointId(int ANPRPointId) {
		this.ANPRPointId = ANPRPointId;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public ANPRCamera getANPRCamera() {
		return ANPRCamera;
	}

	public void setANPRCamera(ANPRCamera aNPRCamera) {
		ANPRCamera = aNPRCamera;
	}

	public String getVehicleRegistrationNO() {
		return vehicleRegistrationNO;
	}

	public void setVehicleRegistrationNO(String vehicleRegistrationNO) {
		this.vehicleRegistrationNO = vehicleRegistrationNO;
	}

}
