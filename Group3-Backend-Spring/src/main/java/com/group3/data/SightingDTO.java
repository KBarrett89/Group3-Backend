package com.group3.data;

import java.time.LocalDateTime;

public class SightingDTO {

	private String streetName;
	private LocalDateTime timeStamp;
	private Double latitude;
	private Double longitude;

	public SightingDTO(String streetName, LocalDateTime timeStamp, Double latitude, Double longitude) {
		super();
		this.streetName = streetName;
		this.timeStamp = timeStamp;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public SightingDTO() {

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

}
