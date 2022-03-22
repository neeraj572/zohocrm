package com.leads.service;

import java.util.List;

import com.leads.entity.Leads;

public interface LeadsService {

	public void saveLeadInfo(Leads leads);

	public List<Leads> getLeadInfo(Leads leads);

	public Leads findLeadInfo(Long id);

}
