package com.Rats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Rats.utility.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailServ;
	@RequestMapping("/sendEmails")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("body") String body,ModelMap model) {
		emailServ.sendSimpleMessage(to, sub, body);
		model.addAttribute("msg","email sent");
		return "compose_email";
		
	}
	
	

}
