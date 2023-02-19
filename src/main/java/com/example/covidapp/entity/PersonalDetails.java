package com.example.covidapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class PersonalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Blood_Group;
	private String Age;
	private String Covid_vaccine_id;
	private String COVID_Vaccination_Certificate1_Date;
	private String COVID_Vaccination_Certificate2_ID;
	private String COVID_Vaccination_Certificate2_Date;
	private String First_Vaccination_City_Name;
	private String Second_Vaccination_City_Name;
	
	@ManyToOne
	private UserRegister register;
	

	
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public PersonalDetails(int id, String blood_Group, String age, String covid_vaccine_id,
			String cOVID_Vaccination_Certificate1_Date, String cOVID_Vaccination_Certificate2_ID,
			String cOVID_Vaccination_Certificate2_Date, String first_Vaccination_City_Name,
			String second_Vaccination_City_Name, UserRegister register) {
		super();
		this.id = id;
		Blood_Group = blood_Group;
		Age = age;
		Covid_vaccine_id = covid_vaccine_id;
		COVID_Vaccination_Certificate1_Date = cOVID_Vaccination_Certificate1_Date;
		COVID_Vaccination_Certificate2_ID = cOVID_Vaccination_Certificate2_ID;
		COVID_Vaccination_Certificate2_Date = cOVID_Vaccination_Certificate2_Date;
		First_Vaccination_City_Name = first_Vaccination_City_Name;
		Second_Vaccination_City_Name = second_Vaccination_City_Name;
		this.register = register;
	}


	public UserRegister getRegister() {
		return register;
	}


	public void setRegister(UserRegister register) {
		this.register = register;
	}


	public PersonalDetails() {
		super();
	}
	@Override
	public String toString() {
		return "PersonalDetails [Blood_Group=" + Blood_Group + ", Age=" + Age + ", Covid_vaccine_id=" + Covid_vaccine_id
				+ ", COVID_Vaccination_Certificate1_Date=" + COVID_Vaccination_Certificate1_Date
				+ ", COVID_Vaccination_Certificate2_ID=" + COVID_Vaccination_Certificate2_ID
				+ ", COVID_Vaccination_Certificate2_Date=" + COVID_Vaccination_Certificate2_Date
				+ ", First_Vaccination_City_Name=" + First_Vaccination_City_Name + ", Second_Vaccination_City_Name="
				+ Second_Vaccination_City_Name + "]";
	}
	public String getBlood_Group() {
		return Blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		Blood_Group = blood_Group;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getCovid_vaccine_id() {
		return Covid_vaccine_id;
	}
	public void setCovid_vaccine_id(String covid_vaccine_id) {
		Covid_vaccine_id = covid_vaccine_id;
	}
	public String getCOVID_Vaccination_Certificate1_Date() {
		return COVID_Vaccination_Certificate1_Date;
	}
	public void setCOVID_Vaccination_Certificate1_Date(String cOVID_Vaccination_Certificate1_Date) {
		COVID_Vaccination_Certificate1_Date = cOVID_Vaccination_Certificate1_Date;
	}
	public String getCOVID_Vaccination_Certificate2_ID() {
		return COVID_Vaccination_Certificate2_ID;
	}
	public void setCOVID_Vaccination_Certificate2_ID(String cOVID_Vaccination_Certificate2_ID) {
		COVID_Vaccination_Certificate2_ID = cOVID_Vaccination_Certificate2_ID;
	}
	public String getCOVID_Vaccination_Certificate2_Date() {
		return COVID_Vaccination_Certificate2_Date;
	}
	public void setCOVID_Vaccination_Certificate2_Date(String cOVID_Vaccination_Certificate2_Date) {
		COVID_Vaccination_Certificate2_Date = cOVID_Vaccination_Certificate2_Date;
	}
	public String getFirst_Vaccination_City_Name() {
		return First_Vaccination_City_Name;
	}
	public void setFirst_Vaccination_City_Name(String first_Vaccination_City_Name) {
		First_Vaccination_City_Name = first_Vaccination_City_Name;
	}
	public String getSecond_Vaccination_City_Name() {
		return Second_Vaccination_City_Name;
	}
	public void setSecond_Vaccination_City_Name(String second_Vaccination_City_Name) {
		Second_Vaccination_City_Name = second_Vaccination_City_Name;
	}

	

}
