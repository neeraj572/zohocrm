package com.leads.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(long id, String firstName, String email, String company, String lastName, String mobile,String leadSource) {
       
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("neerajkumaravijit3@gmail.com");
        message.setTo(email); 
        message.setSubject("thanks for registering "+firstName); 
        message.setText("your id is "+id+" mobile is "+mobile+" first name is "+firstName+" last name is "+lastName+" company is " +company+" you got information about us from "+leadSource);
        emailSender.send(message);
        
    }
}
