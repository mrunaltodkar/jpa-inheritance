package com.capgemini.jpa.inheritance.entity;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {

	private double payPerHour;
	private int hours;

	public ContractEmployee() {
		super();

	}

	public ContractEmployee(int personId, String personName, String company, double payPerHour, int hours) {
		super(personId, personName, company);
		this.payPerHour = payPerHour;
		this.hours = hours;

	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", hours=" + hours + "]";
	}
	
	

}
