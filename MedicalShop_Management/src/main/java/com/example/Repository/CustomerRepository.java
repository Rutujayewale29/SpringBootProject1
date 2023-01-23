package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
  //customize method for find customer list using id
 List<Customer> findById(int id);
//customize method for find customer list using name
 List<Customer> findByName(String name);
 
}
