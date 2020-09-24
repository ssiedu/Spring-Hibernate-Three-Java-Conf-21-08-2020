package com.ssi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailingController {
	
	@Autowired
	private JavaMailSenderImpl mailSender;
	
	@RequestMapping("mailform")
	public String showMailingForm() {
		return "mailingform";
	}
	
	@RequestMapping("sendmail")
	public ModelAndView sendInfoMail(@RequestParam("to") String mailTo, @RequestParam("subject") String subject, @RequestParam("info") String matter) {
		//here will write the code to send the mail
		System.out.println("Sending Mail............");
		
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(mailTo);
		message.setSubject(subject);
		message.setText(matter);
		mailSender.send(message);
		ModelAndView mv=new ModelAndView("mailsuccess");
		return mv;
	}
}
