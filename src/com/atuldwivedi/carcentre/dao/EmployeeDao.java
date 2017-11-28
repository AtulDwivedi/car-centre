package com.atuldwivedi.carcentre.dao;

import java.util.List;

import com.atuldwivedi.carcentre.domain.EmployeeRegistration;

public interface EmployeeDao {
	
	public Long addEmployee(EmployeeRegistration employeeregistration);
	
	public List<EmployeeRegistration> getEmployee();
	
	
	public List<EmployeeRegistration> loginEmployee(String uname, String upass);
	
}
