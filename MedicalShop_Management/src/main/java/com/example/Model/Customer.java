package com.example.Model;
//customer entity class

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
//for table creation
@Entity
@Table(name="customerdata")//for table name
public class Customer 
{
	@Id//for primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//for auto generation id
 private int id;
	@NotNull(message="Please enter Customer name")//for validation
 private String name;
 private int age;
 private String gender;
 @NotNull(message="Enter medicine name")//for required field
 private String medicinename;
 private int price;
 private long contact;
 @Email(message="Enter valid email id")//for email validation
 private String email;
 //constructor
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
//constructor using fields
public Customer(int id, @NotNull(message = "Please enter Customer name") String name, int age, String gender,
		@NotNull(message = "Enter medicine name") String medicinename, int price, long contact,
		@Email(message = "Enter valid email id") String email) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.medicinename = medicinename;
	this.price = price;
	this.contact = contact;
	this.email = email;
}
//getter & setter
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMedicinename() {
	return medicinename;
}
public void setMedicinename(String medicinename) {
	this.medicinename = medicinename;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}