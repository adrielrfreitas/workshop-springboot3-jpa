package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.course.entities.OrderItem;
import com.devfreitas.couse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>
{

}