package com.atuldwivedi.carcentre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="employee")
public class EmployeeRegistration implements Registration {
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(name="emp_name")
	private String empName;	

	@Column(name="emp_email")
	private String empEmail;
	
	@Column(name="emp_phone")
	private Integer empPhone;

	@Override
	public void registrationByFacebook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrationByGoogle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrationByLinkedin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void normalRegistration() {
		// TODO Auto-generated method stub

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Integer getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(int empPhone) {
		this.empPhone = empPhone;
	}
	public Long getEmpId() {
		return empId;
	}

}
