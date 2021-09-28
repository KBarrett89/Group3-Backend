package com.group3.data;

import java.math.BigDecimal;
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
	private int anprId;
	private String streetName;
	private BigDecimal latitude;
	private BigDecimal longitude;

	@OneToMany(mappedBy = "ANPRPointId")
	private List<ANPRObservations> ANPRObservations;

	public ANPRCamera(String streetName, BigDecimal latitude, BigDecimal longitude) {
		super();
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public ANPRCamera() {

	}

	public int getAnprId() {
		return anprId;
	}

	public void setAnprId(int anprId) {
		this.anprId = anprId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public List<ANPRObservations> getANPRObservations() {
		return ANPRObservations;
	}

	public void setANPRObservations(List<ANPRObservations> ANPRObservations) {
		this.ANPRObservations = ANPRObservations;
	}
}
