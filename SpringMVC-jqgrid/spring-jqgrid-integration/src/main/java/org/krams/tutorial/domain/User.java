package org.krams.tutorial.domain;

import java.io.Serializable;

/**
 * A simple POJO to represent our user domain  
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = -7655571929339490814L;
	
	private Long id;
	private String firstName;
	private String lastName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
