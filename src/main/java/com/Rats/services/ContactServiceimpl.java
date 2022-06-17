package com.Rats.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rats.entities.Contact;
import com.Rats.entities.Lead;
import com.Rats.repositories.ContactRepository;
import com.Rats.repositories.LeadRepository;
@Service
public class ContactServiceimpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
		
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contacts = contactRepo.findAll();
		
		return contacts;
	}

	@Override
	public Contact findById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}


}
