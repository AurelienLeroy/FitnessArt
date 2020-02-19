package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Apnee implements Serializable {
	
	@Id
	@GeneratedValue
	private int idApnee;
	public int getIdApnee() {
		return idApnee;
	}



	public void setIdApnee(int idApnee) {
		this.idApnee = idApnee;
	}

	private int depth;
	private int time;

	
	public Apnee() {
		
	}
	
	

	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}



	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	

	
	
	

}
