package com.med.time1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@RequestMapping("/detail")
	public String detail() {
		
		return "detail.html";
		
	}
	

}
