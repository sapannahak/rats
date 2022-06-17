package com.Rats.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rats.entities.Contact;
import com.Rats.entities.ContactBilling;
import com.Rats.entities.Lead;
import com.Rats.repositories.BillRepository;
import com.Rats.repositories.ContactRepository;
import com.Rats.repositories.LeadRepository;

@RestController
public class RestfulController {
	
	@Autowired
	private LeadRepository leadRepo;
@Autowired
private ContactRepository contactRepo;
	@Autowired
	private BillRepository billRepo;
	
	@GetMapping("contactBill/{id}")
	public ContactBilling contactBill(@PathVariable long id) {
		Optional<ContactBilling> findById = billRepo.findById(id);
		ContactBilling bill = findById.get();
		return bill;
	}
	@GetMapping("/contactAllBill")
	public List<ContactBilling> contactAllBill() {
		List<ContactBilling> bills = billRepo.findAll();
		
		return bills;
	}
	
	
	
	
	
	
	@GetMapping("/getAllLeads")
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	
	@GetMapping("getOneLead/{id}")
	public Lead getOneLead(@PathVariable long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}
	
	
	@GetMapping("getAllContacts")
	public List<Contact> getAllContacts(){
		List<Contact> contact = contactRepo.findAll();
		return contact;
	}
	@GetMapping("getAllContacts/{id}")
	public Contact getOneContact(@PathVariable long id){
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}
	

}
