package com.chima.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chima.demo.api.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, String> {
	
	//public List<Post> findByUserId(String userId);

}
