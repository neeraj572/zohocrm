package com.leads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.leads.entity.Leads;
import com.leads.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/compose")
	public String loadComposeEmail(@ModelAttribute("leads") Leads leads,ModelMap modelMap) {
		modelMap.addAttribute("leads",leads);
		return "composeEmail";
	}
	@RequestMapping("/send")
	public String sendEmailToUser(ModelMap modelMap,@RequestParam("id") long id,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("company") String company,@RequestParam("email") String email,@RequestParam("mobile") String mobile,@RequestParam("leadSource") String leadSource)
	{
		emailService.sendSimpleMessage(id,firstName,email,company,lastName,mobile,leadSource);
		modelMap.addAttribute("msg","email sent");
		return "composeEmail";
	}

}
