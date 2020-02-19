package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TirArc implements Serializable  {
	
	@Id
	@GeneratedValue
	private int idTirArc;
	private int nbrPoint;
	private int distance;
	
	public TirArc() {
	}

	public TirArc(int idTirArc, int nbrPoint, int distance) {
		this.idTirArc = idTirArc;
		this.nbrPoint = nbrPoint;
		this.distance = distance;
	}

	public int getIdTirArc() {
		return idTirArc;
	}

	public void setIdTirArc(int idTirArc) {
		this.idTirArc = idTirArc;
	}

	public int getNbrPoint() {
		return nbrPoint;
	}

	public void setNbrPoint(int nbrPoint) {
		this.nbrPoint = nbrPoint;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	

}
