package ch.zli.m223.marlon.RestBest.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CustomerImpl implements Customer{
	
	@Id
	@GeneratedValue
	private Long customerId;
	private String name;
	List<Memo> memos;
	
	protected CustomerImpl() {}
	public CustomerImpl(String name) {
		this.name = name;
		
	}

	@Override
	public Long getId() {
		return customerId;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public List<Memo> getMemos() {
		return memos;
	}

}
