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
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;

@SpringBootTest
public class CustomerRepositoryTest 
{
    @MockBean
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerService customerService;
	//Test for add new Customer
	@Test
	void testaddCustomer()
	{ 
        Customer c=new Customer(1,"sakshi",23,"female","Paracetemol",80,987654324,"sak@gmail.com");
        Mockito.when(customerRepository.save(c)).thenReturn(c);
        assertEquals(c, customerService.addcustomer(c));
	}
	//Test for get  AllCustomer
	@Test
	void testgetAllCustomer()
	{
		List<Customer>customer=Stream.of(new Customer(2,"aarya",10,"female","Vitamin E",50,324567895,"aa@gmail.com"),new Customer(3,"manish",19,"male","Paracetemol",90,324567876,"mn@gmail.com")).collect(Collectors.toList());
		Mockito.when(customerRepository.findAll()).thenReturn(customer);
		assertEquals(2,customerService.getAllCustomer().size());
		
	}
	//Test for delete Customer
	@Test
	void testDeleteCustomer()
	{
		customerService.deleteCustomer(1);
		Mockito.verify(customerRepository).deleteById(1);
	}
}
