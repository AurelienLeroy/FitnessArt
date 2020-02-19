package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Natation implements Serializable {
	
	@Id
	@GeneratedValue
	private int idNatation;
	private String type;
	private int distance;
	
	public Natation() {
		
	}

	public int getIdNatation() {
		return idNatation;
	}

	public void setIdNatation(int idNatation) {
		this.idNatation = idNatation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}





	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	

}
