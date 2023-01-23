package com.bolsadeideas.springboot.form.app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class RequeridoValidador implements ConstraintValidator<Requerido, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		//Es un helper !StringUtils.hasText(value), es lo mismo que value.isEmpty() || value.isBlank()
		if(value == null || !StringUtils.hasText(value)) {
			return false;
		}	
		return true;
	}

}
