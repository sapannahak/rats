package com.Rats.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rats.entities.Lead;
import com.Rats.repositories.LeadRepository;
@Service
public class LeadServiceimpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) throws RuntimeException{
		leadRepo.save(lead);

	}

	@Override
	public Lead findLeadByID(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteLead(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
}
