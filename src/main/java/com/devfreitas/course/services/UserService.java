package com.devfreitas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfreitas.course.repositories.UserRepository;
import com.devfreitas.entities.User;

@Service
public class UserService 
{
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll()
	{
		return repository.findAll();
	}
	
	public User findById(Long id)
	{
		Optional<User> obj = repository.findById(id);
		return obj.get();	
	}
}
