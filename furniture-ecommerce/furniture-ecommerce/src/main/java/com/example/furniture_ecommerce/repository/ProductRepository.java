package com.example.furniture_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.furniture_ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
