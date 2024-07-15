package com.devfreitas.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfreitas.course.services.OrderService;
import com.devfreitas.couse.entities.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource 
{
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>>findAll()
	{
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(Long id)
	{
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
