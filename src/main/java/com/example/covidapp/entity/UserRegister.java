package com.example.covidapp.entity;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRegister {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private String  address;
	private String city;
	private String state;
	private String pincode;
	private String phone_No;
	private String password;
	private String confirm_Password;
	
	@jakarta.persistence.OneToMany(mappedBy = "register")
	private List<PersonalDetails> personal_details=new LinkedList<>();
	
	public List<PersonalDetails> getPersonal_details() {
		return personal_details;
	}
	public void setPersonal_details(List<PersonalDetails> personal_details) {
		this.personal_details = personal_details;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getMiddle_Name() {
		return middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_Password() {
		return confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		this.confirm_Password = confirm_Password;
	}
	public UserRegister() {
		super();
	}
	public UserRegister(int id, String first_Name, String middle_Name, String last_Name, String address, String city,
			String state, String pincode, String phone_No, String password, String confirm_Password,
			List<PersonalDetails> personal_details) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.middle_Name = middle_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phone_No = phone_No;
		this.password = password;
		this.confirm_Password = confirm_Password;
		this.personal_details = personal_details;
	}
	@Override
	public String toString() {
		return "UserRegister [id=" + id + ", first_Name=" + first_Name + ", middle_Name=" + middle_Name + ", last_Name="
				+ last_Name + ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", phone_No=" + phone_No + ", password=" + password + ", confirm_Password=" + confirm_Password
				+ ", personal_details=" + personal_details + "]";
	}
	
	

}
