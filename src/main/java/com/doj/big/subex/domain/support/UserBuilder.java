package com.doj.big.subex.domain.support;

import com.doj.big.subex.domain.User;

/**
 * @author Dinesh.Rajput
 *
 */
public class UserBuilder  extends EntityBuilder<User>{

	@Override
    void initProduct() {
        this.product = new User();
    }

    public UserBuilder credentials(String username, String password) {
        this.product.setUsername(username);
        this.product.setPassword(password);
        return this;
    }

	@Override
	User assembleProduct() {
		return null;
	}

}
