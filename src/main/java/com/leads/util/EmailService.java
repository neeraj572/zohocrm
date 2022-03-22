package com.leads.util;

public interface EmailService {

	public void sendSimpleMessage(long id, String firstName, String email, String company, String lastName, String mobile,
			String leadSource);

}
