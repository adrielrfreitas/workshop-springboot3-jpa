package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>
{
	
}
