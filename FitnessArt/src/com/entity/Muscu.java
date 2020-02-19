package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Muscu implements Serializable {
	
	@Id
	@GeneratedValue
	private int idMuscu;
	private int weight;
	private int repetition;
	
	public Muscu() {
		
	}

	public int getIdMuscu() {
		return idMuscu;
	}

	public void setIdMuscu(int idMuscu) {
		this.idMuscu = idMuscu;
	}

	public int getRepetition() {
		return repetition;
	}

	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	
}
