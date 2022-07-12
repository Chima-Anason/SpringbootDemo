package com.chima.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chima.demo.api.People;


@Repository
public interface UserRepository extends CrudRepository<People, String> {
	
	// public List<People> findByLocationId(String locationId); 

}
