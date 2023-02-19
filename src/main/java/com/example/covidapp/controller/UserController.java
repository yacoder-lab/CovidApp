package com.example.covidapp.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.covidapp.entity.PersonalDetails;
import com.example.covidapp.entity.UserRegister;
import com.example.covidapp.repo.PersonalDetailsRepos;
import com.example.covidapp.repo.UserRepository;

@Controller
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PersonalDetailsRepos personalDetailsRepos;
	
	@RequestMapping("/")
	public String index() {
		
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "index";
	}
	
	@PostMapping("/login")
	public String NextScreen(@RequestParam("phone_no") String phone ,@RequestParam("password") String password,Model m) {
		
		List<UserRegister> findAll = userRepository.findAll();
		
		for(UserRegister i :findAll) {
			
			if(i.getPassword().equals(password) && i.getPhone_No().equals(phone)) {
				
				m.addAttribute("data",i);
				m.addAttribute("Blood",i.getPersonal_details().get(0).getBlood_Group());
				return "index2";

			}
		}
		return "login";
		
		
	}
	
	@GetMapping("/register")
	public String register() {
				
		return "register";
	}
	
	@PostMapping("/register")
	public String RegisterHandle(@ModelAttribute("loginData") UserRegister register,BindingResult result,jakarta.servlet.http.HttpSession session,Model m) {
		
		
		try {
			if(result.hasFieldErrors()) {

				
				System.out.println(result);
				
				return "register";
			}

			
			
			if(register.getConfirm_Password().equals(register.getPassword())) {
			
			UserRegister save = userRepository.save(register);
			
			System.out.println("Saved File ......"+save);

			session.setAttribute("data", save);
			return "details";
			}
			
		} catch (Exception e) {
			
			m.addAttribute("loginData",new UserRegister());
			
			session.setAttribute("username", "username alreday exists");

			session.setAttribute("email", "email alreday exists");

			return "register";
		
		}
		
		return "register";
	
		
	}
	
	@PostMapping("/details")
	public String DetailsRegister(@ModelAttribute("personaldetail") PersonalDetails personalDetails,Model m) {
		
		this.personalDetailsRepos.save(personalDetails);
		
		List<UserRegister> findAll = this.userRepository.findAll();

		
		
		
		
		return "redirect:/login";
		
	}
	@GetMapping("/login")
	public String login() {
				
		return "login";
	}

}