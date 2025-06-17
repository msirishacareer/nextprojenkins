package com.nextpro.nextproapi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="extranalapi")
public class extranalap {
	@Id
	private int id;
	private String name;
	private String city;
	public extranalap() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "extranalap [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	

}
