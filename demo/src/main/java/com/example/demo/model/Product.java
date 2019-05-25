package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	private int id;
	private String name;
	private String address;
	private String details; 
	
	public Product() {		
	}
	
	public Product(int id, String name, String address, String details) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getdetails() {
		return details;
	}

	public void setdetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", address=" + address + ", details=" + details + "]";
	}
}
