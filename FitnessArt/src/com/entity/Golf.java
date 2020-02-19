package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Golf implements Serializable {
	
	@Id
	@GeneratedValue
	private int idGolf;
	private String level;
	private int series;
	
	public Golf() {
		
	}

	public int getIdGolf() {
		return idGolf;
	}

	public void setIdGolf(int idGolf) {
		this.idGolf = idGolf;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}
	
	

}
