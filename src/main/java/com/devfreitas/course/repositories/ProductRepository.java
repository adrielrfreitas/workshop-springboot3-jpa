package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.couse.entities.OrderItem;

public interface ProductRepository extends JpaRepository<OrderItem, Long>
{
	
}
