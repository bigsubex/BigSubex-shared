/**
 * 
 */
package com.doj.big.subex.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Dinesh.Rajput
 *
 */
@Embeddable
public class LanguagePK {
	
	@Column(name="CODE")
    private String code;

    @Column(name="SUPER_CLASS")
    private String super_class;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuper_class() {
		return super_class;
	}

	public void setSuper_class(String super_class) {
		this.super_class = super_class;
	}
    
}
