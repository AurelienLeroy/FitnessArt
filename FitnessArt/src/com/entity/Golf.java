package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Golf extends Activity implements Serializable {
	
	private String level;
	private int series;
	
	public Golf() {
		super();
	}
	
	

	public Golf(int idActivity, String nameActivity) {
		super(idActivity, nameActivity);
	}



	public Golf(int idActivity, String nameActivity, String level, int series) {
		super(idActivity, nameActivity);
		this.level = level;
		this.series = series;
	}
	
	
	
}
