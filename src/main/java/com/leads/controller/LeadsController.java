package com.leads.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leads.entity.Leads;
import com.leads.service.LeadsService;

@Controller
public class LeadsController {
	
	@Autowired
	private LeadsService leadService;
	
	@RequestMapping("/leads")
	public String loadSaveLeads() {
		return "saveLeads";
	}
	
	@RequestMapping("/save")
	public String saveLeads(@ModelAttribute("leads") Leads leads,ModelMap modelMap) {
		leadService.saveLeadInfo(leads);
		modelMap.addAttribute("msg","lead saved!");
		return "saveLeads";
	}
	@RequestMapping("/get")
	public String getLeads(@ModelAttribute("leads") Leads leads,ModelMap modelMap) {
		List<Leads> leadinfo = leadService.getLeadInfo(leads);
		modelMap.addAttribute("leads",leadinfo);
		return "searchLeads";
	}
	@RequestMapping("/find")
	public String findLeads(@RequestParam("id") Long id,ModelMap modelMap) {
		Leads lead = leadService.findLeadInfo(id);
		modelMap.addAttribute("lead",lead);
		return "leadsInfo";
	}

}
