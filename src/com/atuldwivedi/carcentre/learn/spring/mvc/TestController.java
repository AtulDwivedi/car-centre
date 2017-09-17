package com.atuldwivedi.carcentre.learn.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/showTestForm")
	public String showTestForm(Model model){
		
		model.addAttribute("std", new Student());
		
		return "test-form";
	}
	
	@RequestMapping("/processTestForm")
	public String processTestForm(@ModelAttribute("std") Student std){
		System.out.println(std.getFirstName());
		return "process-test-form";
	}

}
