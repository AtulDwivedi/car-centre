package com.atuldwivedi.carcentre.learn.spring.mvc.cust;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CompNameConstraintValidator implements ConstraintValidator<CompName, String> {

	private String compNamePrifix;

	@Override
	public void initialize(CompName compName) {
		this.compNamePrifix = compName.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = false;

		if (value != null) {
			result = value.startsWith(compNamePrifix);
		} else {
			result = true;
		}

		return result;
	}

}
