package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.MedicalShop;

public interface MedicalShopRepository extends JpaRepository<MedicalShop,Integer> {

	//customize method for find medical shop using name
	List<MedicalShop> findByName(String name);
	//customize method for find medical shop using id
    List<MedicalShop> findById(int id);
  //customize method find medical shop using location
	List<MedicalShop> findBylocation(String location); 
}
