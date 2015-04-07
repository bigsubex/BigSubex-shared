package com.doj.big.subex.domain;

import java.io.Serializable;

/**
 * @author Dinesh.Rajput
 *
 */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5427840854992462665L;
	//To do
	
    private String username;
    private String password;
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
