package com.med.time1.controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/provider")
public class ProviderController1 {
	
	@RequestMapping("/info") //comment appelé la méthode(action) dans le controleur à partir du navigateur
	@ResponseBody // elle crée une page html dans le mémoir et dans le body du cette page html me retourne le return de la méthode ou est mis responsebody
	public String info() {
		System.out.println(" hello bootcamp 2");
		//return ("<h2 align=center>mon bootcamp 2</h2>");
		//return "info.html";
		return "hello time 1";
	}
	
	@RequestMapping("/data")
	public String data(Model model) { //Model:objet dans le framwork spring  utilisé si je veux envoyé des données à mon view
				
	String nom ="Aloui Mohamed";
	String email="aloui.sh7@gmail.com";
	int tel = 93375678;
	String adresse="lyon";
	model.addAttribute("nomVariableHtml", nom);
	model.addAttribute("emailVariableHtml", email);
	model.addAttribute("telVariableHtml", tel);
	model.addAttribute("adresselVariableHtml", adresse);
	
	List<String> names =new ArrayList<>();
	names.add("Aymen");
	names.add("sami");
	names.add("ali");
	names.add("kamel");
	model.addAttribute("names",names);
		
		return "data.html";
	}
	
	
	
	
	

}
