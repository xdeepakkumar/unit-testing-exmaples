package com.unitTesting.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.unitTesting.model.Person;

@SpringBootTest
public class PersonRepositoryTest {
	
	@Autowired
	private PersonRepository personRepository;

	@Test
	void isPersonExistsById() {
		Person person = new Person(123L,"Deepak Kumar", "d@gmail.com");
		personRepository.save(person);
		Boolean result = personRepository.isPersonExistById(123L);
		assertThat(result).isTrue();
	}
}
