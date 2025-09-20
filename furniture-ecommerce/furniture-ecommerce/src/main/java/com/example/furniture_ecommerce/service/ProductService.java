package com.example.furniture_ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.furniture_ecommerce.entity.Product;
import com.example.furniture_ecommerce.repository.ProductRepository;
import com.example.furniture_ecommerce.request.ProductRequestDto;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void create(ProductRequestDto d) {
	Product product = new Product();
	product.setId(null);
	product.setName(d.getName());
	product.setPrice(d.getPrice());
	product.setImage(d.getImage());
	productRepository.save(product);

}
}