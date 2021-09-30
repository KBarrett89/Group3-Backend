package com.group3.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.group3.data.ANPRObservations;
import com.group3.data.Citizen;
import com.group3.data.SubscriberRecords;
import com.group3.data.VehicleRegistration;
import com.group3.data.repos.ANPRCameraRepo;
import com.group3.data.repos.ANPRObservationsRepo;
import com.group3.data.repos.CitizenRepo;
import com.group3.data.repos.DataRepo;
import com.group3.data.repos.SubscriberRecordsRepo;
import com.group3.services.VehicleRegDB;

@SpringBootTest
@ActiveProfiles("test")
public class VehicleServiceDBUnitTest {

	@Autowired
	private VehicleRegDB service;

	@MockBean
	private DataRepo repo;
	@MockBean
	private CitizenRepo citizenRepo;
	@MockBean
	private SubscriberRecordsRepo subRepo;
	@MockBean
	private ANPRCameraRepo cameraRepo;
	@MockBean
	private ANPRObservationsRepo observationsRepo;

	@Test
	void testFindByRegNo() {
		String testPlate = "1QW1 234";
		List<VehicleRegistration> testReg = new ArrayList<>();
		VehicleRegistration testRegistration = new VehicleRegistration(1, null, "1QW1 234", "Audi", "A5", "Black",
				"Jon", "Smith", "13 Baker Street", "2002-01-01", "300201");
		testReg.add(testRegistration);

		Mockito.when(this.repo.findByVehicleRegistrationNO(testPlate)).thenReturn(testReg);

		assertThat(this.service.getVehicleReg("1QW1 234")).isEqualTo(testReg);

		Mockito.verify(this.repo, Mockito.times(1)).findByVehicleRegistrationNO(testPlate);
	}

	@Test
	void testFindByHomeAddress() {
		String testAddress = "13 Baker Street";
		List<Citizen> testPerson = new ArrayList<>();
		Citizen person = new Citizen(2L, "London", "Jon", "Smith", null, "13 Baker Street", "Male");
		testPerson.add(person);

		Mockito.when(this.citizenRepo.findByHomeAddress(testAddress)).thenReturn(testPerson);

		assertThat(this.service.getCitizenByAddress("13 Baker Street")).isEqualTo(testPerson);

		Mockito.verify(this.citizenRepo, Mockito.times(1)).findByHomeAddress(testAddress);
	}

	@Test
	void testFindByDateOfBirth() {
		String testDOB = "2002-01-01";
		List<Citizen> testPerson = new ArrayList<>();
		Citizen person = new Citizen(2L, "London", "Jon", "Smith", null, "13 Baker Street", "Male");
		testPerson.add(person);

		Mockito.when(this.citizenRepo.findByDateOfBirth(testDOB)).thenReturn(testPerson);

		assertThat(this.service.getCitizenByDateOfBirth("2002-01-01")).isEqualTo(testPerson);

		Mockito.verify(this.citizenRepo, Mockito.times(1)).findByDateOfBirth(testDOB);
	}

	@Test
	void testFindByForename() {
		String testName = "Jon";
		List<SubscriberRecords> testRecord = new ArrayList<>();
		SubscriberRecords record = new SubscriberRecords("07924332432", "Jon", "Smith", null, "13 Baker Street",
				"Vodafone");
		testRecord.add(record);

		Mockito.when(this.subRepo.findByForename(testName)).thenReturn(testRecord);

		assertThat(this.service.getSubscriberByForename("Jon")).isEqualTo(testRecord);

		Mockito.verify(this.subRepo, Mockito.times(1)).findByForename(testName);
	}

	@Test
	void testFindObersvationByRegNo() {
		String testPlate = "1QW1 234";
		List<ANPRObservations> testObservation = new ArrayList<>();
		ANPRObservations observation = new ANPRObservations(1, null, "1QW1 234");
		testObservation.add(observation);

		Mockito.when(this.observationsRepo.findByVehicleRegistrationNO(testPlate)).thenReturn(testObservation);

		assertThat(this.service.getObservationByPlate("1QW1 234")).isEqualTo(testObservation);

		Mockito.verify(this.observationsRepo, Mockito.times(1)).findByVehicleRegistrationNO(testPlate);
	}

}
