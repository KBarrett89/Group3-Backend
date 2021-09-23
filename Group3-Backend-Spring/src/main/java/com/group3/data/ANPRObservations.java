package com.group3.data;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;

@Entity
public class ANPRObservations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ANPRPointId;
	private LocalDateTime timeStamp;

	@ManyToMany
	private ANPRCamera ANPRCamera;
	
	@OneToMany(mappedBy = "VehicleRegistration")
	//?? - priateList<Kitten> kittens; - do I need a ANPR Observations list here??
	

	public ANPRObservations(Integer aNPRPointId, LocalDateTime timeStamp) {
		super();
		ANPRPointId = aNPRPointId;
		this.timeStamp = timeStamp;
	}

	public ANPRObservations() {

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

}
