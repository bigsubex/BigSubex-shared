package com.doj.big.subex.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.doj.big.subex.domain.User;

/**
 * @author Dinesh.Rajput
 *
 */
public class UserValidator implements Validator {
	
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
    @Override
    public boolean supports(Class<?> clazz) {
        return (User.class).isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "company", "required", new Object[] { "Enter Company" });
        ValidationUtils.rejectIfEmpty(errors, "city", "required", new Object[] { "Enter City" });
        ValidationUtils.rejectIfEmpty(errors, "country", "required", new Object[] { "Contry" });
        ValidationUtils.rejectIfEmpty(errors, "url", "required", new Object[] { "Enter Url" });
        ValidationUtils.rejectIfEmpty(errors, "surname", "required", new Object[] { "Enter Surname" });
        ValidationUtils.rejectIfEmpty(errors, "employee", "required", new Object[] { "Enter Employee" });
        ValidationUtils.rejectIfEmpty(errors, "pokemon", "required", new Object[] { "Select one" });
        ValidationUtils.rejectIfEmpty(errors, "email", "required", new Object[] { "Select one" });
        
        if (!errors.hasFieldErrors("email")) {
            User user = (User) target;
            String email = user.getEmail();
            if (!email.matches(EMAIL_PATTERN)) {
                errors.rejectValue("email", "invalid");
            }
        }
    }
}
