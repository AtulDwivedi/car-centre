package com.atuldwivedi.carcentre.learn.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/car")
public class CarController {

	@RequestMapping("/showCarForm")
	public String nameOfMethodIsNot(){
		return "show-car-form";
	}
	
	
	@RequestMapping("/processCarForm")
	public String nameOfMethodIsNot2(HttpServletRequest request, Model model){
		
		String carName = request.getParameter("carName");
		
		carName = carName.toUpperCase();
		
		model.addAttribute("carInUpper", carName);
		
		
		return "process-show-car-form";
	}
	
	
	@RequestMapping("/processCarFormV2")
	public String nameOfMethodIsfmwlm(@RequestParam("carName") String cNm, Model model){
		
		
		
		cNm = cNm.toUpperCase();
		
		model.addAttribute("carInUpper", cNm);
		
		
		return "process-show-car-form";
	}
	
	@RequestMapping("/showAddCarForm")
	public String showAddCarForm(Model model){
		
		model.addAttribute("car", new Car());
		
		return "show-add-car-form";
	}
	
	@RequestMapping("/processAddCarForm")
	public String processAddCarForm(@ModelAttribute("car") Car myCar){
		System.out.println("Color: "+myCar.getCarColor());
		return "process-add-car-form";
	}
}
