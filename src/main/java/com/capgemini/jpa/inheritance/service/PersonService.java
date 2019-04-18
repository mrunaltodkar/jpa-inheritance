package com.capgemini.jpa.inheritance.service;

import com.capgemini.jpa.inheritance.entity.Person;

public interface PersonService {

	public void addPerson(Person person);

	public Person getPersonById(int id);
}
