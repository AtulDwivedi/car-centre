package com.atuldwivedi.carcentre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atuldwivedi.carcentre.domain.EmployeeRegistration;



@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/registration")
	public String  empRegistration(Model model) {
		
		EmployeeRegistration emp=new EmployeeRegistration();
		
		model.addAttribute("emp",emp);
		
		return "employee-registration";
	}
	

	

}
