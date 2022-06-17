package com.Rats.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rats.entities.ContactBilling;
@Service
public class BillingServiceimpl implements BillingService {

	@Autowired
	private BillRepository billing;
	
	@Override
	public void saveBilling(ContactBilling bill) {
		
		billing.save(bill);
	}

}
