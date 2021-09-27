package com.group3.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ANPRCamera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long anprId;
	private String streetName;
	private Double latitude;
	private Double longitude;

	@OneToMany(mappedBy = "ANPRPointId")
	private List<ANPRObservations> ANPRObservations;

	public ANPRCamera(String streetName, Double latitude, Double longitude) {
		super();
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public ANPRCamera() {

	}

	public Long getAnprId() {
		return anprId;
	}

	public void setAnprId(Long anprId) {
		this.anprId = anprId;
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

	public List<ANPRObservations> getANPRObservations() {
		return ANPRObservations;
	}

	public void setANPRObservations(List<ANPRObservations> aNPRObservations) {
		ANPRObservations = aNPRObservations;
	}
}
