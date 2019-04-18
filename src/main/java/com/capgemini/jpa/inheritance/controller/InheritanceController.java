package com.capgemini.jpa.inheritance.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpa.inheritance.entity.ContractEmployee;
import com.capgemini.jpa.inheritance.entity.Person;
import com.capgemini.jpa.inheritance.entity.RegularEmployee;
import com.capgemini.jpa.inheritance.service.PersonService;

@RestController
public class InheritanceController {

	@Autowired
	private PersonService service;
	
	@RequestMapping("/add")
	public Set<Person> addPerson() {
		Set<Person> person = new HashSet<Person>();
		person.add(new ContractEmployee(101, "Mrunal", "Capgemini", 500.0, 6));
		person.add(new RegularEmployee(102, "Aayush", "Capgemini", 50000));
		return person;
	}
	
}
