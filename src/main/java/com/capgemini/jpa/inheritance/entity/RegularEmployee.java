package com.capgemini.jpa.inheritance.entity;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee {

	private double salary;

	public RegularEmployee() {
		super();

	}

	public RegularEmployee(int personId, String personName, String company, double salary) {
		super(personId, personName, company);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + "]";
	}

}
