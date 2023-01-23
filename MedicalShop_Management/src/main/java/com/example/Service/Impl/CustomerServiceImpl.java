package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;
@Repository
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
    CustomerRepository customerRepository;//creating customer repository object
	@Override
	public List<Customer> findById(int id) {//method for finding customer data using id
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}
	//method for finding customer data using name
	@Override
	public List<Customer> findByName(String name) {
		// TODO Auto-generated method stub
		return customerRepository.findByName(name);
	}
	//method for add new customer data
	@Override
	public Customer addcustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
	//method for finding all customers data
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	//method for update customer data 
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer _customer=customerRepository.findById(customer.getId()).get(0);
		_customer.setId(customer.getId());
		_customer.setName(customer.getName());
		_customer.setAge(customer.getAge());
		_customer.setGender(customer.getGender());
		_customer.setMedicinename(customer.getMedicinename());
		_customer.setPrice(customer.getPrice());
		_customer.setContact(customer.getContact());
		_customer.setEmail(customer.getEmail());
		return customerRepository.save(_customer);
	}
	//method for delete customer data using id
	@Override
	public String deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
		return "Customer is deleted";	
	}
}
