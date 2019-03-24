package com.deep.jsf;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentTwo {

	private String firstName;
	private String lastName;
	private String fatherName;
	private String email;
	private String age;
	private String country;
	private String favLanguage1;
	private String favLanguage2;
	private String favColor;
	private String[] favPet;
	private String password;
	private String phone;
	private String courseCode;

	private Map<String, String> countryOptionsMap;
	private Map<String, String> favLanguageMap;
	public Color[] colorList;
	private Map<String, String> favPetList;

	public StudentTwo() {
		// populate the map of countries

		countryOptionsMap = new LinkedHashMap<>();

		// key, value
		countryOptionsMap.put("Brazil", "BRA");
		countryOptionsMap.put("France", "FRA");
		countryOptionsMap.put("Germany", "DEU");
		countryOptionsMap.put("India", "IND");
		countryOptionsMap.put("Turkey", "TUR");
		countryOptionsMap.put("United Kingdom", "GBR");
		countryOptionsMap.put("United States", "USA");

		favLanguageMap = new LinkedHashMap<>();
		favLanguageMap.put("Language1 - Java", "Java");
		favLanguageMap.put("Language2 - Python", "Python");
		favLanguageMap.put("Language3 - R", "R");

		colorList = new Color[3];
		colorList[0] = new Color("Color - Red", "Red");
		colorList[1] = new Color("Color - Green", "Green");
		colorList[2] = new Color("Color - Blue", "Blue");

		favPetList = new LinkedHashMap<>();
		favPetList.put("Dog", "Dog");
		favPetList.put("Cat", "Cat");
		favPetList.put("Rabits", "Rabits");

		// Pre-Populate Data
		firstName = "P_Deep";
		lastName = "P_Patil";
		country = "United States";
		favLanguage1 = "Java";
		favLanguage2 = "Python";
		favColor = "Green";
		favPet = new String[3];
		favPet[0] = "Dog";

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

	public Map<String, String> getCountryOptionsMap() {
		return countryOptionsMap;
	}

	public String getFavLanguage1() {
		return favLanguage1;
	}

	public void setFavLanguage1(String favLanguage1) {
		this.favLanguage1 = favLanguage1;
	}

	public void setCountryOptionsMap(Map<String, String> countryOptionsMap) {
		this.countryOptionsMap = countryOptionsMap;
	}

	public Map<String, String> getFavLanguageMap() {
		return favLanguageMap;
	}

	public void setFavLanguageMap(Map<String, String> favLanguageMap) {
		this.favLanguageMap = favLanguageMap;
	}

	public static class Color {
		public String colorLabel;
		public String colorValue;

		public Color(String colorLabel, String colorValue) {
			this.colorLabel = colorLabel;
			this.colorValue = colorValue;
		}

		public String getColorLabel() {
			return colorLabel;
		}

		public String getColorValue() {
			return colorValue;
		}

	}

	public String getFavColor() {
		return favColor;
	}

	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}

	public Color[] getColorList() {
		return colorList;
	}

	public void setColorList(Color[] colorList) {
		this.colorList = colorList;
	}

	public String getFavLanguage2() {
		return favLanguage2;
	}

	public void setFavLanguage2(String favLanguage2) {
		this.favLanguage2 = favLanguage2;
	}

	public String[] getFavPet() {
		return favPet;
	}

	public void setFavPet(String[] favPet) {
		this.favPet = favPet;
	}

	public Map<String, String> getFavPetList() {
		return favPetList;
	}

	public void setFavPetList(Map<String, String> favPetList) {
		this.favPetList = favPetList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void validateCourseCode(FacesContext context, UIComponent component, Object value) {

		if (value == null) {
			return;
		}

		String data = value.toString();
		// let consider course should be start with LUV
		if (!data.startsWith("LUV")) {
			FacesMessage message = new FacesMessage("Course Code must start with LUV");

			throw new ValidatorException(message);
		}

	}

}