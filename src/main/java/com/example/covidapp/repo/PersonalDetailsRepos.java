package com.example.covidapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.covidapp.entity.PersonalDetails;

public interface PersonalDetailsRepos extends JpaRepository<PersonalDetails, Integer> {

	
	
	
}
