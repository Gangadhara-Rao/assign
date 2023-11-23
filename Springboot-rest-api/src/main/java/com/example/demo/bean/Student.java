package com.example.demo.bean;

public class Student {
	private int id;
	private String fistname;
	private String lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFistname() {
		return fistname;
	}
	public void setFistname(String fistname) {
		this.fistname = fistname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Student(int id, String fistname, String lastname) {
		super();
		this.id = id;
		this.fistname = fistname;
		this.lastname = lastname;
	}
	
	

}
