package com.example.Service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Model.MedicalShop;
import com.example.Repository.MedicalShopRepository;
import com.example.Service.MedicalShopService;
@Repository
public class MedicalShopServiceImpl implements MedicalShopService
{
	@Autowired
     MedicalShopRepository medicalShopRepository;
	//method for add medical shop data
	@Override
	public MedicalShop addMedical(MedicalShop medicalShop) {
		// TODO Auto-generated method stub
		return medicalShopRepository.save(medicalShop);
	}
	//method for update medical shop data
	@Override
	public MedicalShop updateMedical(MedicalShop medicalShop) {
		// TODO Auto-generated method stub
		MedicalShop _medicalshop=medicalShopRepository.findById(medicalShop.getId()).get(0);
		_medicalshop.setId(medicalShop.getId());
		_medicalshop.setName(medicalShop.getName());
		_medicalshop.setMedicaltype(medicalShop.getMedicaltype());
		_medicalshop.setMobno(medicalShop.getMobno());
		_medicalshop.setEmail(medicalShop.getEmail());
		_medicalshop.setLocation(medicalShop.getLocation());
		//_medicalshop.setCustomerList(medicalShop.getCustomerList());
		return medicalShopRepository.save(_medicalshop);
	}
	//method for delete medical shop data
	@Override
	public String deleteMedical(int id) {
		// TODO Auto-generated method stub
		medicalShopRepository.deleteById(id);
		
		return "Medicalshop is Deleted";
	}
     //method for get all medical data
	@Override
	public List<MedicalShop> getAllMedical() {
		// TODO Auto-generated method stub
		return medicalShopRepository.findAll();
	}
    //method for get medical data using name 
	@Override
	public List<MedicalShop> findByName(String name) {
		// TODO Auto-generated method stub
		return medicalShopRepository.findByName(name);
	}
    //method for get medical data using location
	@Override
	public List<MedicalShop> findBylocation(String location) {
		// TODO Auto-generated method stub
		return medicalShopRepository.findBylocation(location);
	}
    //method for get medical data using id
	@Override
	public List<MedicalShop> findById(int id) {
		// TODO Auto-generated method stub
		return medicalShopRepository.findById(id);
	}

}
