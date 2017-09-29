package com.atuldwivedi.carcentre.learn.spring.mvc;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.atuldwivedi.carcentre.learn.spring.mvc.cust.CompName;

public class Car {
	
//	@NotNull
	@CompName(value="Maruti", message="Comp name should start with Maruti")
	private String carName;
	
	@Pattern(regexp="^[a-zA-Z0-9]@[a-z]{10}", message="email pattern")
	private String carEmail;
	
	@NotNull(message="is required")
	@Size(min=3, message="should be greater than 2")
	private String carColor;
	
	private String countryOfOrigin;
	private String end;
	
	private String[] addOns;
	
	private boolean loan;
	
	/*@Min(value=1, message="should be 1 or more")
	@Max(value=9999, message="should be less than 9999")
	private int number;*/
	
	@Min(value=1, message="should be 1 or more")
	@Max(value=9999, message="should be less than 9999")
	private Integer number;
	
	private String comment;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Future
	private Date nextEmiDate;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past
	private Date dop;
	
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Car() {
		super();
//		this.carName = "Honda City";
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String[] getAddOns() {
		return addOns;
	}

	public void setAddOns(String[] addOns) {
		this.addOns = addOns;
	}

	public boolean isLoan() {
		return loan;
	}

	public void setLoan(boolean loan) {
		this.loan = loan;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCarEmail() {
		return carEmail;
	}

	public void setCarEmail(String carEmail) {
		this.carEmail = carEmail;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	public Date getNextEmiDate() {
		return nextEmiDate;
	}

	public void setNextEmiDate(Date nextEmiDate) {
		this.nextEmiDate = nextEmiDate;
	}

}
