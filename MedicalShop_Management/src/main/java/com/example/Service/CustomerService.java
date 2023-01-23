package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Customer;

@Service
public interface CustomerService 
{
	//for finding any customer data using id
	List<Customer> findById(int id);
	//for find any customer data using name
	 List<Customer> findByName(String name);
	 //for add customer new data
	public Customer addcustomer(Customer customer);
	//for get all customers
	 List<Customer> getAllCustomer();
	 //for update any customer 
	 Customer updateCustomer(Customer customer);
	 //for delete any customer using id
	 String deleteCustomer(int id);
}
