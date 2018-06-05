package com.deva.dao;

import java.util.List;

import com.deva.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}
