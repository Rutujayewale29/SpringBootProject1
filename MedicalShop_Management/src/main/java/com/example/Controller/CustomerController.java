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

import com.example.Model.Customer;
//import com.example.Model.MedicalShop;
import com.example.Service.CustomerService;

@RestController//rest controller annotation allows the class to handle request made by user
public class CustomerController 
{
	@Autowired//used for automatic dependency injection or auto-wired a bean into another bean
 CustomerService customerService;//creating customer variable
	//Post customer data
 @PostMapping("/customer")
 public ResponseEntity<Customer> addcustomer(@Valid @RequestBody Customer c){
		return new ResponseEntity<Customer>(customerService.addcustomer(c),HttpStatus.CREATED);
}
 //get all customers data
 @GetMapping("/customer/all")
 public List<Customer> getAllCustomer()
 {
	return customerService.getAllCustomer();
 }
 //get customer data using id
 @GetMapping("/customer/id/{id}")
 public List<Customer> getById(@PathVariable int id)
 {
	return customerService.findById(id);
 }
 //get customer data using name
 @GetMapping("/customer/name/{name}")
 public List<Customer> getByName(@PathVariable String name)
 {
	return customerService.findByName(name); 
 }
 //put mapping for update customer data
 @PutMapping("/customer")
 public Customer updateCustomer(@RequestBody Customer c)
 {
	 return  customerService.updateCustomer(c);
 }
 //Delete mapping used for delete customer data using id
 @DeleteMapping("/customer/del/{id}")
 public String deleteCustomer(@PathVariable int id)
 {
	  customerService.deleteCustomer(id);
	  return "Customer is deleted";
 }
}