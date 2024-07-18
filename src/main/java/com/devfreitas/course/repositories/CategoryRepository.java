package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>
{

}