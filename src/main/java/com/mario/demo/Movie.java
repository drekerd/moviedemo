package com.mario.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity
public class Movie {
	
	@Id
	private int id;
	private String name;
	private int rating;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	


}
