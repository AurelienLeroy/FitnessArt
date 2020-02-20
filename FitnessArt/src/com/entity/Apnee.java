package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Apnee extends Activity implements Serializable {
	
	private int depth;
	private int time;
	
	public Apnee() {
		super();
	}
	

	public Apnee(int idActivity, String nameActivity, int depth, int time) {
		super(idActivity, nameActivity);
		this.depth = depth;
		this.time = time;
	}
	
}
