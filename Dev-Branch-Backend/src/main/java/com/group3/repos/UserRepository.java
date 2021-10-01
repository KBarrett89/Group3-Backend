package com.group3.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group3.model.UserTable;

@Repository
public interface UserRepository extends JpaRepository<UserTable, Long> {

	UserTable findByUsername(String username);

}