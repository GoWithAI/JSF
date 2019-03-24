package com.deep.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="userDataEx")
@SessionScoped
public class StudentPrePopulateData {
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage1;
	private String favLanguage2;
	private String favColor;
	private String[] favPet;

	public StudentPrePopulateData() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLanguage1() {
		return favLanguage1;
	}

	public void setFavLanguage1(String favLanguage1) {
		this.favLanguage1 = favLanguage1;
	}

	public String getFavLanguage2() {
		return favLanguage2;
	}

	public void setFavLanguage2(String favLanguage2) {
		this.favLanguage2 = favLanguage2;
	}

	public String getFavColor() {
		return favColor;
	}

	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}

	public String[] getFavPet() {
		return favPet;
	}

	public void setFavPet(String[] favPet) {
		this.favPet = favPet;
	}
}
