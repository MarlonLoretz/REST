package ch.zli.m223.marlon.RestBest.service;

import java.util.List;

import ch.zli.m223.marlon.RestBest.model.Customer;
import ch.zli.m223.marlon.RestBest.model.Memo;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	Customer createCustomer(String userName);
	Customer getCustomerById(String id);
	Memo addMemoToCustomer(Long cusstomerId, String memoText);

}
