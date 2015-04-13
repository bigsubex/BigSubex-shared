package com.doj.big.subex.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.doj.big.subex.domain.Employee;

public class EmployeeValidator implements Validator {
	
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	@Override
	public boolean supports(Class<?> clazz) {
		return (Employee.class).isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "firstName", "required", new Object[] { "Enter First Name" });
        ValidationUtils.rejectIfEmpty(errors, "lastName", "required", new Object[] { "Enter Last Name" });
        ValidationUtils.rejectIfEmpty(errors, "gender", "required", new Object[] { "Select Gender" });
        ValidationUtils.rejectIfEmpty(errors, "title", "required", new Object[] { "Enter Title" });
        ValidationUtils.rejectIfEmpty(errors, "mobile", "required", new Object[] { "Enter Mobile Number" });
        ValidationUtils.rejectIfEmpty(errors, "email", "required", new Object[] { "Enter Email" });
        ValidationUtils.rejectIfEmpty(errors, "userType", "required", new Object[] { "Select user type" });
        
        if (!errors.hasFieldErrors("emailAddress")) {
        	Employee account = (Employee) target;
            String email = account.getEmail();
            if (!email.matches(EMAIL_PATTERN)) {
                errors.rejectValue("email", "invalid");
            }
        }
	}

}
