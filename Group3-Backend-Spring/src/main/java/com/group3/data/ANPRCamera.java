package com.group3.data;

public class ANPRCamera {

	private String streetName;
	private Double latitude;
	private Double longitude;

	public ANPRCamera(String streetName, Double latitude, Double longitude) {
		super();
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public ANPRCamera() {

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
