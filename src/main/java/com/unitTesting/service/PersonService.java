package com.unitTesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unitTesting.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public Object getAllPersons() {
		return this.personRepository.findAll();
	}

	public PersonService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

}
