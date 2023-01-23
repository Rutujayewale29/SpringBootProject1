package com.example.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Model.MedicalShop;
import com.example.Service.MedicalShopService;


@RestController//rest controller annotation allows the class to handle request made by user
public class MedicalShopController 
{
 @Autowired//used for automatic dependency injection or auto-wired a bean into another bean
 MedicalShopService medicalShopService;//creating customer variable
//Post medical data
 @PostMapping("/medical")
 public ResponseEntity<MedicalShop> addMedicalShop(@Valid @RequestBody MedicalShop m){
	return new ResponseEntity<MedicalShop>(medicalShopService.addMedical(m),HttpStatus.CREATED); 
 }
//get medical data
 @GetMapping("/medical")
 public List<MedicalShop>getAllMedical()
 {
	return medicalShopService.getAllMedical(); 
 }
//get medical data using id
 @GetMapping("/medical/id/{id}")
 public List<MedicalShop> findById(@PathVariable int id)
 {
	return medicalShopService.findById(id);
	 
 }
 //get medical data using name
 @GetMapping("/medical/name/{name}")
 public List<MedicalShop> findByName(@PathVariable String name)
 {
	return medicalShopService.findByName(name);
 }
//get medical data using location
 @GetMapping("/medical/location/{location}")
 public List<MedicalShop> findBylocation(@PathVariable String location)
 {
	return medicalShopService.findBylocation(location);
 }
//delete medical data using id
 @DeleteMapping("/medical/del/{id}")
 public String deleteMedical(@PathVariable int id)
 {
	 medicalShopService.deleteMedical(id);
	 return "Medical is deleted";
 }
//update medical data
 @PutMapping("/medical")
 public MedicalShop updateMedical(@RequestBody MedicalShop m)
 {
	return medicalShopService.updateMedical(m);
 }
}
