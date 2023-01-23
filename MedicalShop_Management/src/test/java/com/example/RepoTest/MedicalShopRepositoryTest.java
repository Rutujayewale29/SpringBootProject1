package com.example.RepoTest;


import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.example.Model.Customer;
import com.example.Model.MedicalShop;
import com.example.Repository.MedicalShopRepository;
import com.example.Service.MedicalShopService;
@SpringBootTest
public class MedicalShopRepositoryTest 
{
 @Autowired
 private MedicalShopService medicalShopService;
 @Autowired
 @MockBean
 private MedicalShopRepository medicalShopRepository;
//test add medical method
 @Test
 void testaddMedicalShop()
 {
	 List<Customer>custormerlist=Stream.of(new Customer(1,"kriti",20,"female","Eye Drop",180,789654356,"kri@gmail.com"),new Customer(2,"dipika",22,"female","Cold Syrup",120,342654356,"dip@gmail.com")).collect(Collectors.toList());
	 MedicalShop m=new MedicalShop(9,"Purab Medical","Consulting Pharmacy",987654567,"purab@gmail.com","Dadar",custormerlist);
	 Mockito.when(medicalShopRepository.save(m)).thenReturn(m);
	 assertEquals(m,medicalShopService.addMedical(m));
 }
 //test case for get all medical shop data
 @Test
 void testAllMedicalShop()
 {
	List<Customer>customerlist=Stream.of(new Customer(1,"shweta",23,"female","Eye Drop",180,789654356,"shw@gmail.com"),new Customer(2,"kalyani",20,"female","Hand Sanitizer",150,987654356,"kal@gmail.com")).collect(Collectors.toList());
	List<MedicalShop>medicalshop =Stream.of(new MedicalShop(9,"Purab Medical","Consulting Pharmacy",987654567,"purab@gmail.com","Dadar",customerlist),new MedicalShop(9,"Purab Medical","Consulting Pharmacy",987654567,"purab@gmail.com","Dadar",customerlist)).collect(Collectors.toList());
	Mockito.when(medicalShopRepository.findAll()).thenReturn(medicalshop);
	assertEquals(2,medicalShopService.getAllMedical().size());
 }
 //test case for delete medical shop
 @Test
 void testDeleteMedical()
 {
	 medicalShopService.deleteMedical(2);
	 Mockito.verify(medicalShopRepository).deleteById(2);
 }
}
