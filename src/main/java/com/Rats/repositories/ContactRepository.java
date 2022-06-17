package com.Rats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rats.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
