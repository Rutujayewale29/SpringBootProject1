package com.example;
//Rutuja Yewale Medical Shop Management System
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicalShopManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalShopManagementApplication.class, args);
		System.out.println("MedicalShop Management System Started....");
		//OneToMany mapping 
		//Mapping between One Medical Shop and many Customer list 
	}

}
