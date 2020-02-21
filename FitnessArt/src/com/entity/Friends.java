package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Friends implements Serializable {
	
	@Id
	@GeneratedValue
	private int idFriend;
	private String name;
	private String firstName;
	
	public Friends(int idFriend, String name, String firstName) {
		this.idFriend = idFriend;
		this.name = name;
		this.firstName = firstName;
	}
	
	public Friends() {
	}
	
	

}
