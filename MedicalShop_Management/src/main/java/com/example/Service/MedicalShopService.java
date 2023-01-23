package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.MedicalShop;
@Service
public interface MedicalShopService
{ 
	//for add new medical shop
	public MedicalShop addMedical(MedicalShop medicalShop);
	//for update any medical shop
 	MedicalShop updateMedical(MedicalShop medicalShop);
 	//for delete any medical shop
 	String deleteMedical(int id);
 	//for get all medical shop
 	List<MedicalShop> getAllMedical();
 	//for find medical shop list using name
	List<MedicalShop> findByName(String name);
	//for find medical shop list using id
	List<MedicalShop> findById(int id);
	//for find medical shop list using location
	List<MedicalShop> findBylocation(String location);

}
