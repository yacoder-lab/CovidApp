package com.example.covidapp.controller;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.covidapp.entity.PersonalDetails;
import com.example.covidapp.entity.UserRegister;
import com.example.covidapp.repo.PersonalDetailsRepos;
import com.example.covidapp.repo.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	
	@Autowired
	private UserRepository userRepository;

	
	@Autowired
	private PersonalDetailsRepos detailsRepos;
		
	@GetMapping("/login")	
	public String AdminPage() {
	
		return "admin";
	}
	
	@PostMapping("/login")
	public String AdminPages(@RequestParam("username") String username,@RequestParam("password") String password,Model m) {
		if(username.equals("admin") && password.equals("@2@2")) {
			
			
			List<UserRegister> fi_user = this.userRepository.getState();
			
			List<UserRegister> fi_user_city = this.userRepository.getCity();

			
			
			m.addAttribute("byState",fi_user);
			m.addAttribute("byCity",fi_user_city);

			
			
			return "adminhome";
	}
		return "admin";
	
		
	}
	
	
	@PostMapping("/search")
	public String AdminSearch(@RequestParam(required = true,value = "state") String state,@RequestParam(required = true,value = "city") String city,HttpSession s,Model m) {
		
		System.out.println(state);
		
		List<UserRegister> fi_user = this.userRepository.getState();
		
		List<UserRegister> fi_user_city = this.userRepository.getCity();

		
		
		m.addAttribute("byState",fi_user);
		m.addAttribute("byCity",fi_user_city);
		List<UserRegister> findBy = this.userRepository.findByState(state);

		
		List<UserRegister> findByCityAndStateorDate = this.userRepository.findByCityAndState(city, state);

		
		
		
		
		m.addAttribute("data",findByCityAndStateorDate);
		return "adminhome";
		
	}
	
	
	
	
	
	

}
