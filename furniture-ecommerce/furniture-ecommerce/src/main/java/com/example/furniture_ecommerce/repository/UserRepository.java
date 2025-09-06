package com.example.furniture_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.furniture_ecommerce.entity.User;
import com.example.furniture_ecommerce.service.Optional;

public interface UserRepository  extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);

}
