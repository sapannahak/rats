package com.Rats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Rats.entities.Contact;
import com.Rats.entities.ContactBilling;
import com.Rats.entities.Lead;
import com.Rats.repositories.BillingService;
import com.Rats.repositories.ContactRepository;
import com.Rats.repositories.LeadRepository;
import com.Rats.services.ContactService;
import com.Rats.services.LeadService;

@Controller
public class ContactsController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private ContactRepository contactRepo;
	
	@Autowired
	private LeadService leadService;
	@RequestMapping("/contactpage")
	public String contact(@RequestParam("id") long id,@ModelAttribute Contact contact,ModelMap model) {
		Lead lead = leadService.findLeadByID(id);
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setLeadSource(lead.getLeadSource());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		
	    leadService.deleteLead(id);
		
	    List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts",contacts);
		
		return "list_contact";
	}
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.findById(id);
		model.addAttribute("contact",contact);
		return "contact_info";
	}
	@RequestMapping("/listContacts")
	public String listContacts(ModelMap model) {
		 List<Contact> contacts = contactService.getAllContact();
			model.addAttribute("contacts",contacts);
		return "list_contact";
	}
	@RequestMapping("/contactBill")
	public String contactBill(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.findById(id);
		model.addAttribute("contacts",contact);
		return "contact_bill";
	}
	
	@Autowired
	private BillingService bill;
	
	@RequestMapping("/listContactBil")
	public String save(@ModelAttribute("contactBilling") ContactBilling contactBilling,ModelMap model) {
		bill.saveBilling(contactBilling);
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts",contacts);
		return "list_contact";
	}

}
