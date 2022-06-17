package com.Rats;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Rats.entities.Lead;
import com.Rats.services.LeadService;

@SpringBootTest
class RatsApplicationTests {

	
	@Autowired
	private LeadService leadService;
	
	@Test
	void listAll() {
		List<Lead> leads = leadService. getAllLeads();
		leads.forEach(Lead->System.out.println(Lead.getFirstName()+" "+Lead.getLastName()
		+" "+Lead.getEmail()+" "+Lead.getLeadSource()+" "+Lead.getMobile()));
	}

}
