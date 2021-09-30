package com.group3.services;

import org.springframework.stereotype.Service;

import com.group3.data.Audit;
import com.group3.data.repos.AuditRepo;

@Service
public class AuditServices implements AuditServicesInterface {

	private AuditRepo repo;

	public AuditServices(AuditRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addInfo(Audit info) {
		this.repo.save(info);

	}

}