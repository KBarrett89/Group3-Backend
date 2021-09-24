package com.group3.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group3.data.Citizen;
import com.group3.data.SubscriberRecords;
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
	public List<VehicleRegistration> getVehicleReg() {
//		Demo Object

//		VehicleRegistration vehicleReg = new VehicleRegistration(1000345L, "01/01/2000", 1000234234234243L, "audi", "8",
//				"black", "jon", "smith", "1 jonsmith road", "01/01/2000", "300");
//		List<VehicleRegistration> regList = new ArrayList<>();
//		regList.add(vehicleReg);
//		return regList;

//		Reality DB

		return this.repo.findAll();
	}

	@Override
	public List<VehicleRegistration> getVehicleRegByPlate(String plate) {
//		Demo Object
//		VehicleRegistration truReg = null;
//
//		VehicleRegistration vehicleReg = new VehicleRegistration(1000345L, "01/01/2000", 1000234234234243L, "audi", "8",
//				"black", "jon", "smith", "1 jonsmith road", "01/01/2000", "300");
//		List<VehicleRegistration> regList = new ArrayList<>();
//		regList.add(vehicleReg);

//		Reality DB

		List<VehicleRegistration> targetRegList = getVehicleReg(plate);

		VehicleRegistration targetReg = null;
		for (int i = 0; i < targetRegList.size(); i++) {
			if (targetRegList.get(i).getVehicleRegistrationNO() == plate) {
				targetReg = targetRegList.get(i);
			}
		}

		String forename = targetReg.getForename();
		String surname = targetReg.getSurname();
		String address = targetReg.getAddress();
		String dateOfBirth = targetReg.getDateOfBirth();
		String driverLicenceID = targetReg.getDriverLicenceID();

		String vehicleRegistrationNumber = targetReg.getVehicleRegistrationNO();
		Long registrationID = targetReg.getRegistrationID();
		LocalDateTime registrationDate = targetReg.getRegistrationDate();
		String make = targetReg.getMake();
		String model = targetReg.getModel();
		String colour = targetReg.getColour();

		Citizen citizen = null;
		List<Citizen> targetForename = getCitizenByForename(forename);
		List<Citizen> targetSurname = getCitizenBySurname(surname);
		for (int i = 0; i < targetForename.size(); i++) {
			for (int j = 0; j < targetSurname.size(); j++) {
				if (targetForename.get(i).getForename() == targetSurname.get(j).getForename()) {
					citizen = targetForename.get(i);
				}
			}
		}

		Long citizenID = citizen.getCitizenID();
		String placeOfBirth = citizen.getPlaceOfBirth();

		SubscriberRecords targetSub = null;
		List<SubscriberRecords> targetRecord = getSubscriberByForename(forename);
		for (int i = 0; i < targetRecord.size(); i++) {
			if (targetRecord.get(i).getForename() == forename) {
				targetSub = targetRecord.get(i);
			}
		}

		String phoneNumber = targetSub.getPhoneNumber();

		System.out.println(phoneNumber);

		return targetRegList;

//	    Demo

//		Perform next search

//		Reality DB

//		forenameList = return this.repo.findByNameIgnoreCase(forename);
//		surnameList = return this.repo.findByNameIgnoreCase(surname);

//		then find common denominator

	}

	public List<VehicleRegistration> getVehicleReg(String plate) {
		return this.repo.findByVehicleRegistrationNO(plate);
	}

	public List<Citizen> getCitizenByForename(String forename) {
		return this.citizenRepo.findByForename(forename);
	}

	public List<Citizen> getCitizenBySurname(String surname) {
		return this.citizenRepo.findBySurname(surname);
	}

	public List<SubscriberRecords> getSubscriberByForename(String forename) {
		return this.subRepo.findSubByForename(forename);
	}

}
