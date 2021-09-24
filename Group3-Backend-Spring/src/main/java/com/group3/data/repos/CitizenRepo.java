package com.group3.data.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group3.data.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	List<Citizen> findByForename(String forename);

	List<Citizen> findBySurname(String surname);

}
