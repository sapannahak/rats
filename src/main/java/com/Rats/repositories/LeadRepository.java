package com.Rats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rats.entities.Lead;
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
