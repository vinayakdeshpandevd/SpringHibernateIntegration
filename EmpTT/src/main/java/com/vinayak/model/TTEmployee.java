package com.vinayak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TTEmployee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column
private String fname;
@Column
private String lname;
@Column
private String role;
@Column
private Long sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Long getSal() {
	return sal;
}
public void setSal(Long sal) {
	this.sal = sal;
}
}
