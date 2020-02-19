package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Jogging extends Activity implements Serializable {
	
	private int distance;
	private int time;
	
	public Jogging() {
		super();
	}
	
	public Jogging(int idActivity, String nameActivity) {
		super(idActivity, nameActivity);
	}
	
}
