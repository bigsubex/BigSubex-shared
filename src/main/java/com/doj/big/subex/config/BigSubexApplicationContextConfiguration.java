package com.doj.big.subex.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author Dinesh.Rajput
 *
 */

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.doj.big.subex.service",
        "com.doj.big.subex.repository", "com.doj.big.subex.domain.support" })
public class BigSubexApplicationContextConfiguration {
	
	//To do
}
