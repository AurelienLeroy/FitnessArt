package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Muscu extends Activity implements Serializable {
	
	private int weight;
	private int repetition;
	
	public Muscu() {
		super();
	}
	
	public Muscu(int idActivity, String nameActivity) {
		super(idActivity, nameActivity);
	}
	
}
