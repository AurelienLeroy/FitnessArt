package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Natation extends Activity implements Serializable {
	
	private String type;
	private int distance;
	
	public Natation() {
		super();
	}
	
	public Natation(int idActivity, String nameActivity) {
		super(idActivity, nameActivity);
	}

	public Natation(int idActivity, String nameActivity, String type, int distance) {
		super(idActivity, nameActivity);
		this.type = type;
		this.distance = distance;
	}
	
	
}
