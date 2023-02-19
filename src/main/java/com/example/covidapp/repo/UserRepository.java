package com.example.covidapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.example.covidapp.entity.UserRegister;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserRegister, Integer> {

	@Query(nativeQuery = true,value="SELECT * FROM covid.user_register group by state")
	List<UserRegister> getState();
	
	@Query(nativeQuery = true,value="SELECT * FROM covid.user_register group by city")
	List<UserRegister> getCity();

	@Query("select r from UserRegister r where r.state=:state")
	 List<UserRegister> getByState(@Param("state") String state);
	
	List<UserRegister> findByCityAndState(String city,String state);
	
	List<UserRegister> findByState(String state);

	
	
	

	
}
