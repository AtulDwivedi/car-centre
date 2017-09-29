package com.atuldwivedi.carcentre.learn.spring.mvc.cust;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CompNameConstraintValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface CompName {

	public String value() default "Honda";

	public String message() default "Comp name should start with Honda";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
