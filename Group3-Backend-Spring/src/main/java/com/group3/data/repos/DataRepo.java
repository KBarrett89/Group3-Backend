package com.group3.data.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group3.data.VehicleRegistration;

@Repository
public interface DataRepo extends JpaRepository<VehicleRegistration, Integer> {

}
