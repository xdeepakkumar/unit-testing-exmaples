package com.unitTesting.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.unitTesting.repository.PersonRepository;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@Mock
	private PersonRepository personRepository;

	private PersonService personService;
	
	@BeforeEach
	void setUp() {
		this.personService = new PersonService(this.personRepository);
	}
	
	@Test
	void getAllPerson() {
		personService.getAllPersons();
		verify(personRepository).findAll();
	}

}
