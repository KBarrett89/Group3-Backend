package com.group3.data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SightingDTO {

	private String streetName;
	private LocalDateTime timeStamp;
	private BigDecimal latitude;
	private BigDecimal longitude;

	public SightingDTO(String streetName, LocalDateTime timeStamp, BigDecimal latitude, BigDecimal longitude) {
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

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

}
