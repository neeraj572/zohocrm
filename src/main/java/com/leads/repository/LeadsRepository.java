package com.leads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leads.entity.Leads;
@Repository
public interface LeadsRepository extends JpaRepository<Leads, Long> {

}
