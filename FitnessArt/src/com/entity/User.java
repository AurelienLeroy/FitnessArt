package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User implements Serializable {
	
	@Id
	@GeneratedValue
	private int idUser;
	private String name;
	private String fistName;
	private String sex;
	private int size;
	private int weight;
	private String pseudo;
	private String password;
	
	public User() {
		
	}

	public int getIdUser() {
		return idUser;
	}

	public User(int idUser, String name, String fistName, String sex, int size, int weight, String pseudo,
			String password) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.fistName = fistName;
		this.sex = sex;
		this.size = size;
		this.weight = weight;
		this.pseudo = pseudo;
		this.password = password;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
