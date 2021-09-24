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
	private LocalDateTime timeStamp;

	@ManyToOne
	private ANPRCamera ANPRCamera;
	
	@ManyToOne(mappedBy = "VehicleRegistration")
		

	public ANPRObservations(LocalDateTime timeStamp) {
		super();
			this.timeStamp = timeStamp;
	}

	public ANPRObservations() {

	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

}
