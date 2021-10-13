package com.unitTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unitTesting.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	@Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.id = ?1")
	Boolean isPersonExistById(Long id);
}
