package ch.zli.m223.marlon.RestBest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.zli.m223.marlon.RestBest.model.Customer;
import ch.zli.m223.marlon.RestBest.model.Memo;
import ch.zli.m223.marlon.RestBest.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepo.findAllCustoemrs();
	}

	@Override
	public Customer createCustomer(String userName) {
		return customerRepo.createCustomer(userName);
	}

	@Override
	public Customer getCustomerById(String id) {
		return customerRepo.findById(id).orElseThrow(RuntimeException::new);
	}

	@Override
	public Memo addMemoToCustomer(Long cusstomerId, String memoText) {
		return null;
	}

}
