package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Activity implements Serializable {
	
	@Id
	@GeneratedValue
	private int idActivity;
	private String nameActivity;
	
	public Activity(int idActivity, String nameActivity) {
		this.idActivity = idActivity;
		this.nameActivity = nameActivity;
	} 

	public Activity() {
	}
	

}
