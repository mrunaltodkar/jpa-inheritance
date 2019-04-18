package com.capgemini.jpa.inheritance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpa.inheritance.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
