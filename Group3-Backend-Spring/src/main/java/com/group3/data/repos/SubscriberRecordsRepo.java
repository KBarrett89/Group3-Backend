package com.group3.data.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group3.data.SubscriberRecords;

@Repository
public interface SubscriberRecordsRepo extends JpaRepository<SubscriberRecords, Integer> {

	List<SubscriberRecords> findSubByForename(String forename);

}
