package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Jogging implements Serializable {
	
	public int getIdJogging() {
		return idJogging;
	}

	public void setIdJogging(int idJogging) {
		this.idJogging = idJogging;
	}

	@Id
	@GeneratedValue
	private int idJogging;
	private float distance;
	private int time;
	
	public Jogging() {
		
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}




	
	

}
