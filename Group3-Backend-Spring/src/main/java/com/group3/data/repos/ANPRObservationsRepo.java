package com.group3.data.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group3.data.ANPRObservations;

@Repository
public interface ANPRObservationsRepo extends JpaRepository<ANPRObservations, Integer> {

}
