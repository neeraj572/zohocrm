package com.leads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leads.entity.Leads;
import com.leads.repository.LeadsRepository;

@Service
public class LeadsServiceImpl implements LeadsService {
	@Autowired
	private LeadsRepository leadsRepo;

	@Override
	public void saveLeadInfo(Leads leads) {
	leadsRepo.save(leads);
		
	}

	@Override
	public List<Leads> getLeadInfo(Leads leads) {
		List<Leads> findAll = leadsRepo.findAll();
		return findAll;
	}

	@Override
	public Leads findLeadInfo(Long id) {
		Optional<Leads> findById = leadsRepo.findById(id);
		Leads leads = findById.get();
		return leads;
	}

}
