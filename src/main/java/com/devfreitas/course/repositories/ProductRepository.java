package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
	
}
