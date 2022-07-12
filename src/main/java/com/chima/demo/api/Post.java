package com.chima.demo.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	private String id;
	private String postDate;
	
	@ManyToOne
	private People people;
	private String details;
	
	
	
	public Post() {
		
	}


	public Post(String id, String postDate, People people, String details) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.people = people;
		this.details = details;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPostDate() {
		return postDate;
	}


	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}


	public People getPeople() {
		return people;
	}



	public void setPeople(People people) {
		this.people = people;
	}



	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}
	
	



}
