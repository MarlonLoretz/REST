package ch.zli.m223.marlon.RestBest.model;

import java.util.List;

public interface Customer {
	
	Long getId();
	String getName();
	List<Memo> getMemos();

}
