package com.radiantsage.service;

import com.radiantsage.model.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public Product registerProduct(Product product) {
		System.out.println("--- registerProduct ---");
		return product;
	}

}
