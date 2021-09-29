package com.group3.services;

import java.util.List;

import com.group3.data.Person;

public interface PersonServices {

	public List<Person> getPerson();

	public List<Person> getPersonWithPlate(int id);

}
