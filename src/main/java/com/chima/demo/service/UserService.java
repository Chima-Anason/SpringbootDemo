package com.chima.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chima.demo.api.People;
import com.chima.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;	
	
	public List<People> getAllUsers() {
		List<People> users = new ArrayList<>();
		
		userRepository.findAll()
		.forEach(users::add);
		
		return users;
	}
		
	public Optional<People> getUser(String id) {
		return userRepository.findById(id);
	}

	public void addUser(People user) {
		userRepository.save(user);
	}

	public void updateUser(String id, People user) {
		userRepository.save(user);
	}
	
	public void deleteUser(String id) {
	     userRepository.deleteById(id);	
	}
	
	
//	public List<People> getUsersByLocation(String id) {
//	    List<People> users = new ArrayList<>();
//		
//	    userRepository.findByLocationId(id)
//	    .forEach(users::add);
//		
//	    return users;
//	}

}
