package com.example.Model;
//MedicalShop entity class
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
//for table creation
@Entity
@Table(name="medicalShop")
public class MedicalShop 
{
	@Id//for primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//for auto generation id
 private int id;
	@NotNull(message="Shop Name is requird")//for required field
 private String name;
	@NotNull(message="type is required")//for required field
	private String medicaltype;
	private long mobno;
	@Email(message="Please Enter Valid emailid")//for email id validation
	private String email;
	private String location;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)//for unidirectional mapping of two entities
	private List<Customer> customerList=new ArrayList<>();//for creating customer list
	//constructor
	public MedicalShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor using fields
	public MedicalShop(int id, @NotNull(message = "Shop Name is requird") String name,
			@NotNull(message = "type is required") String medicaltype, long mobno,
			@Email(message = "Please Enter Valid emailid") String email, String location, List<Customer> customerList) {
		super();
		this.id = id;
		this.name = name;
		this.medicaltype = medicaltype;
		this.mobno = mobno;
		this.email = email;
		this.location = location;
		this.customerList = customerList;
	}
	//getter and setter
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
	public String getMedicaltype() {
		return medicaltype;
	}
	public void setMedicaltype(String medicaltype) {
		this.medicaltype = medicaltype;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
}
