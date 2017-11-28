package com.atuldwivedi.carcentre.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atuldwivedi.carcentre.dao.EmployeeDao;
import com.atuldwivedi.carcentre.dao.EmployeeDaoImpl;
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
	
	@RequestMapping("/employee-save")
	public String empAdd(@ModelAttribute("emp") EmployeeRegistration employeeregistration,Model model) {
		
		EmployeeDao employeeDao=new EmployeeDaoImpl();		
		Long emp_pk=	employeeDao.addEmployee(employeeregistration);		
		List<EmployeeRegistration> emp=null;
		
		if(emp_pk!=null) {
			emp=employeeDao.getEmployee();			
		}
		model.addAttribute("emp",emp);
	
		
		return "Employee-profile";
	}

	

}
