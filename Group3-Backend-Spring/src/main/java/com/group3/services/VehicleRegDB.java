package com.group3.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group3.data.ANPRObservations;
import com.group3.data.Citizen;
import com.group3.data.InfoDTO;
import com.group3.data.PersonDTO;
import com.group3.data.SightingDTO;
import com.group3.data.SubscriberRecords;
import com.group3.data.VehicleDTO;
import com.group3.data.VehicleRegistration;
import com.group3.data.repos.ANPRCameraRepo;
import com.group3.data.repos.ANPRObservationsRepo;
import com.group3.data.repos.CitizenRepo;
import com.group3.data.repos.DataRepo;
import com.group3.data.repos.SubscriberRecordsRepo;

@Service
public class VehicleRegDB implements VehicleServices {

	private DataRepo repo;
	private CitizenRepo citizenRepo;
	private SubscriberRecordsRepo subRepo;
	private ANPRCameraRepo cameraRepo;
	private ANPRObservationsRepo observationsRepo;

	@Autowired
	public VehicleRegDB(DataRepo repo, CitizenRepo citizenRepo, SubscriberRecordsRepo subRepo,
			ANPRCameraRepo cameraRepo, ANPRObservationsRepo observationsRepo) {
		super();
		this.repo = repo;
		this.citizenRepo = citizenRepo;
		this.subRepo = subRepo;
		this.cameraRepo = cameraRepo;
		this.observationsRepo = observationsRepo;
	}

	@Override
	public InfoDTO getVehicleRegByPlate(String plate) {

		InfoDTO dto = new InfoDTO();
		PersonDTO person = new PersonDTO();
		VehicleDTO vehicle = new VehicleDTO();

		VehicleRegistration targetReg = new VehicleRegistration();
		List<VehicleRegistration> targetRegList = getVehicleReg(plate);
		for (int i = 0; i < targetRegList.size(); i++) {
			if (targetRegList.get(i).getVehicleRegistrationNO().equals(plate)) {
				targetReg = targetRegList.get(i);
			}
		}

		person.setForename(targetReg.getForename());
		person.setSurname(targetReg.getSurname());
		person.setAddress(targetReg.getAddress());
		person.setDateOfBirth(targetReg.getDateOfBirth());
		person.setDriverLicenceID(targetReg.getDriverLicenceID());

		vehicle.setVehicleRegistrationNO(targetReg.getVehicleRegistrationNO());
		vehicle.setRegistrationID(targetReg.getRegistrationID());
		vehicle.setRegistrationDate(targetReg.getRegistrationDate());
		vehicle.setMake(targetReg.getMake());
		vehicle.setModel(targetReg.getModel());
		vehicle.setColour(targetReg.getColour());

		String forename = targetReg.getForename();
		String address = targetReg.getAddress();
		LocalDateTime dateOfBirth = targetReg.getDateOfBirth();

		Citizen citizen = new Citizen();
		List<Citizen> targetAddress = getCitizenByAddress(address);
		List<Citizen> targetDateOfBirth = getCitizenByDateOfBirth(dateOfBirth);
		for (int i = 0; i < targetAddress.size(); i++) {
			for (int j = 0; j < targetDateOfBirth.size(); j++) {
				if (targetAddress.get(i).getHomeAddress() == targetDateOfBirth.get(j).getHomeAddress()) {
					citizen = targetAddress.get(i);
				}
			}
		}

		person.setCitizenID(citizen.getCitizenID());
		person.setPlaceOfBirth(citizen.getPlaceOfBirth());

		SubscriberRecords targetSub = new SubscriberRecords();
		List<SubscriberRecords> targetRecord = getSubscriberByForename(forename);
		for (int i = 0; i < targetRecord.size(); i++) {
			if (targetRecord.get(i).getForename().equals(forename)) {
				targetSub = targetRecord.get(i);
			}
		}

		person.setPhoneNumber(targetSub.getPhoneNumber());

		List<SightingDTO> sightings = new ArrayList<>();
		List<ANPRObservations> observations = getObservationByPlate(plate);
		for (int i = 0; i < observations.size(); i++) {
			SightingDTO sighting = new SightingDTO();
			sighting.setTimeStamp(observations.get(i).getTimeStamp());
			sighting.setStreetName(observations.get(i).getANPRCamera().getStreetName());
			sighting.setLatitude(observations.get(i).getANPRCamera().getLatitude());
			sighting.setLongitude(observations.get(i).getANPRCamera().getLongitude());
			sightings.add(sighting);
		}

		dto.setPerson(person);
		dto.setSightingList(sightings);
		dto.setVehicle(vehicle);

		return dto;

	}

	public List<VehicleRegistration> getVehicleReg(String plate) {
		return this.repo.findByVehicleRegistrationNO(plate);
	}

	public List<Citizen> getCitizenByAddress(String address) {
		return this.citizenRepo.findByHomeAddress(address);
	}

	public List<Citizen> getCitizenByDateOfBirth(LocalDateTime dateOfBirth) {
		return this.citizenRepo.findByDateOfBirth(dateOfBirth);
	}

	public List<SubscriberRecords> getSubscriberByForename(String forename) {
		return this.subRepo.findByForename(forename);
	}

	public List<ANPRObservations> getObservationByPlate(String plate) {
		return this.observationsRepo.findByVehicleRegistrationNO(plate);
	}

}
