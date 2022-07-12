package com.chima.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chima.demo.api.People;
import com.chima.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users")
	public List<People> getAllUsers() {

		return userService.getAllUsers();	
	}
	
	@RequestMapping(value = "/users/{id}")
	public Optional<People> getUser(@PathVariable String id) {
	    return userService.getUser(id);
	}
	
	
	@RequestMapping(value="/users", method = RequestMethod.POST)
	public void addUser(@RequestBody People user) {
		userService.addUser(user);
	}
	
	
	 @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	 public void deleteUser(@PathVariable String id) {
	      userService.deleteUser(id);
	 }
	 
	 
	 
	 @RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
	 public void getUser(@PathVariable String id, @RequestBody People user) {

	     userService.updateUser(id, user);

	 }

}
