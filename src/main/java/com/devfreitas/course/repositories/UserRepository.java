package com.devfreitas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfreitas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
{

}