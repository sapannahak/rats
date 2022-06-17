package com.Rats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rats.entities.ContactBilling;

public interface BillRepository extends JpaRepository<ContactBilling, Long> {

}
