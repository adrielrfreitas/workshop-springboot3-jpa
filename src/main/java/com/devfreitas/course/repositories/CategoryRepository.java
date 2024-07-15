package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{
	
}
