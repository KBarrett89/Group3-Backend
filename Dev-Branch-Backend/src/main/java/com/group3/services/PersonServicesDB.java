package com.group3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.group3.data.Person;

@Service
public class PersonServicesDB implements PersonServices {

	@Override
	public List<Person> getPerson() {
		Person person = new Person();
		person.setId(1);
		person.setName("Danny");
		List<Person> people = new ArrayList<>();
		people.add(person);
		return people;
	}

	@Override
	public List<Person> getPersonWithPlate(int id) {
		Person person = new Person();
		person.setId(1);
		person.setName("Danny");
		Person person2 = new Person();
		person2.setId(2);
		person2.setName("Martin");
		List<Person> people = new ArrayList<>();
		people.add(person);
		people.add(person2);
		List<Person> peopleId = new ArrayList<>();
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).getId() == id) {
				Person idPerson = people.get(i);
				peopleId.add(idPerson);
			}
		}
		return peopleId;
	}

}
