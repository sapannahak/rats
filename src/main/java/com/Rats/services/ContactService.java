package com.Rats.services;

import java.util.List;

import com.Rats.entities.Contact;
import com.Rats.entities.Lead;

public interface ContactService {
public void saveContact(Contact contact);
public List<Contact> getAllContact();
public Contact findById(long id);

}
