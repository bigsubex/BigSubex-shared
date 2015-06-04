/**
 * 
 */
package com.doj.big.subex.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.doj.big.subex.domain.Product;
import com.doj.big.subex.domain.ProductSearchCriteria;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public interface ProductSearchService {
	
	Collection<Product> findProducts(ProductSearchCriteria criteria );
}
