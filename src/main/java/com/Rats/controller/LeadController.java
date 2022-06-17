package com.Rats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Rats.entities.Lead;
import com.Rats.services.LeadService;
import com.Rats.utility.EmailService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreateLead")
	public String creatViewLeadPage() {
		return "create_lead";
	}
	@RequestMapping(value ="/saveLead",method = RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		try {
			leadService.saveLead(lead);
			model.addAttribute("lead",lead);
		} catch (Exception e) {
			model.addAttribute("exception","this data exist");
			return "create_lead";
		}
		return "lead_info";
	}
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email,ModelMap model) {
		model.addAttribute("email",email);
		return "compose_email";
		
	}
	
	@RequestMapping("/listAll")
	public String listAll(ModelMap model) {
		List<Lead> leads = leadService. getAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		
		Lead lead = leadService.findLeadByID(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	

}
