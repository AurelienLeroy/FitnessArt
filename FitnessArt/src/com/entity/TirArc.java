package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TirArc extends Activity implements Serializable  {
	
	private int nbrPoint;
	private int distance;
	
	public TirArc() {
		super();
	}
	
	public TirArc(int idActivity, String nameActivity) {
		super(idActivity, nameActivity);
	}
	
}
