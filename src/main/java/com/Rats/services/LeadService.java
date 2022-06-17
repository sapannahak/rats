package com.Rats.services;

import java.util.List;

import com.Rats.entities.Lead;

public interface LeadService {
	
public void saveLead(Lead lead);
public  Lead findLeadByID(long id);
public void deleteLead(long id);
public List<Lead> getAllLeads();
}
