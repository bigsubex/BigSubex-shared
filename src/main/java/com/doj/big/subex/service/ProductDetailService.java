package com.doj.big.subex.service;

import org.springframework.stereotype.Service;

import com.doj.big.subex.domain.Product;

@Service
public interface ProductDetailService {
	
	Product findProduct(long productId);
}
