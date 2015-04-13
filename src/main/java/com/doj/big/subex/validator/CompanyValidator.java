/**
 * 
 */
package com.doj.big.subex.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.doj.big.subex.domain.Company;

/**
 * @author Dinesh.Rajput
 *
 */
public class CompanyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return (Company.class).isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "firmName", "required", new Object[] { "Enter Company name" });
        ValidationUtils.rejectIfEmpty(errors, "city", "required", new Object[] { "Enter City" });
        ValidationUtils.rejectIfEmpty(errors, "country", "required", new Object[] { "Contry" });
        ValidationUtils.rejectIfEmpty(errors, "url", "required", new Object[] { "Enter Url" });
        ValidationUtils.rejectIfEmpty(errors, "district", "required", new Object[] { "Enter district" });
        ValidationUtils.rejectIfEmpty(errors, "employee", "required", new Object[] { "Enter Employee" });
        ValidationUtils.rejectIfEmpty(errors, "postOffice", "required", new Object[] { "Enter Post Office" });
		
	}

}
