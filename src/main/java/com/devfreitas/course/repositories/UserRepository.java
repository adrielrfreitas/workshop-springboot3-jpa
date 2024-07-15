package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	
}
