package ch.zli.m223.marlon.RestBest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zli.m223.marlon.RestBest.model.Customer;
import ch.zli.m223.marlon.RestBest.model.CustomerImpl;

public interface CustomerRepository extends JpaRepository<CustomerImpl, String>{
	
	
	public default List<Customer> findAllCustoemrs(){
		return new ArrayList<Customer>(findAll());
	}
	
	public default Customer createCustomer(String userName) {
		CustomerImpl customerImpl = new CustomerImpl(userName);
		return save(customerImpl);
	}

}
