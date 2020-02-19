package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
//yo lionel
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

	public int getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(int idActivity) {
		this.idActivity = idActivity;
	}

	public String getNameActivity() {
		return nameActivity;
	}

	public void setNameActivity(String nameActivity) {
		this.nameActivity = nameActivity;
	}


	
	

}
