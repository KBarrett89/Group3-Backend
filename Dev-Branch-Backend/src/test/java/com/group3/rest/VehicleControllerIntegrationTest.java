package com.group3.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.group3.data.InfoDTO;
import com.group3.data.PersonDTO;
import com.group3.data.SightingDTO;
import com.group3.data.VehicleDTO;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
@Sql(scripts = { "classpath:schema.sql", "classpath:data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class VehicleControllerIntegrationTest {

	@Autowired
	private MockMvc mockMVC;

	@Autowired
	private ObjectMapper mapper;

	@Test
	void testFindByRegPlate() throws Exception {
		RequestBuilder request = get("/getVehicleRegByPlate/1QW1 234");

		ResultMatcher checkStatus = status().isOk();

		java.sql.Date objDate = java.sql.Date.valueOf("2000-01-01");
		LocalDateTime stamp1 = LocalDateTime.of(2020, 05, 12, 19, 04, 23);
		LocalDateTime stamp2 = LocalDateTime.of(2020, 05, 12, 19, 34, 27);
		LocalDateTime stamp3 = LocalDateTime.of(2020, 05, 12, 19, 45, 29);
		BigDecimal latitude1 = new BigDecimal("90.78");
		BigDecimal longitude1 = new BigDecimal("654.89");
		BigDecimal latitude2 = new BigDecimal("90.78");
		BigDecimal longitude2 = new BigDecimal("654.89");
		BigDecimal latitude3 = new BigDecimal("90.78");
		BigDecimal longitude3 = new BigDecimal("654.89");

		PersonDTO pDTO = new PersonDTO("Jon", "Smith", "13 Baker Street", "07924332432", "2002-01-01", "London", 2L,
				"300201");
		SightingDTO sDTO1 = new SightingDTO("Watling Street", stamp1, latitude1, longitude1);
		SightingDTO sDTO2 = new SightingDTO("Watling Street", stamp2, latitude2, longitude2);
		SightingDTO sDTO3 = new SightingDTO("Watling Street", stamp3, latitude3, longitude3);
		VehicleDTO vDTO = new VehicleDTO("1QW1 234", 1, objDate, "Audi", "A5", "Black");

		List<SightingDTO> sightingList = new ArrayList<>();

		sightingList.add(sDTO1);
		sightingList.add(sDTO2);
		sightingList.add(sDTO3);

		InfoDTO testDTO = new InfoDTO(pDTO, sightingList, vDTO);

		String testAsJSON = this.mapper.writeValueAsString(testDTO);

		ResultMatcher checkBody = content().json(testAsJSON);

		this.mockMVC.perform(request).andExpect(checkStatus).andExpect(checkBody);
	}

}
