package com.schooldemo.project.schoolproject.Dto;

import java.util.UUID;

import com.schooldemo.project.schoolproject.Enum.GenderType;
import com.schooldemo.project.schoolproject.Enum.Status;
import com.schooldemo.project.schoolproject.Enum.Title;
import com.schooldemo.project.schoolproject.Enum.UserType;

public class FacultyDto {
	
private UUID stdId;
	public UUID getStdId() {
	return stdId;
}
public void setStdId(UUID stdId) {
	this.stdId = stdId;
}
	private UUID facultyId;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private GenderType gender;
	private Title title;
	private Status status;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	private String street;
	private String cityName;
	private String cityshortName;
	private String stateName;
	private String stateshortName;
	private String postalCode;
	private String departmentName;
	private String departmentshortName;
	private String countryName;
	private String countryshortName;
	private String phoneNo;
	private String emergencyPhoneNumber;
	private String email;
	private String designation;
	private UUID city_id;
	private UUID state_id;
	private UUID country_id;
	private UUID department_id;
	private String experience;
	private UserType userType;
	private UUID referenceId;
	private String userName;
	private String password;
	private UUID userId;
	
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public UUID getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(UUID referenceId) {
		this.referenceId = referenceId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UUID getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(UUID facultyId) {
		this.facultyId = facultyId;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public GenderType getGender() {
		return gender;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmergencyPhoneNumber() {
		return emergencyPhoneNumber;
	}
	public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityshortName() {
		return cityshortName;
	}
	public void setCityshortName(String cityshortName) {
		this.cityshortName = cityshortName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateshortName() {
		return stateshortName;
	}
	public void setStateshortName(String stateshortName) {
		this.stateshortName = stateshortName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentshortName() {
		return departmentshortName;
	}
	public void setDepartmentshortName(String departmentshortName) {
		this.departmentshortName = departmentshortName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryshortName() {
		return countryshortName;
	}
	public void setCountryshortName(String countryshortName) {
		this.countryshortName = countryshortName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public UUID getCity_id() {
		return city_id;
	}
	public void setCity_id(UUID city_id) {
		this.city_id = city_id;
	}
	public UUID getState_id() {
		return state_id;
	}
	public void setState_id(UUID state_id) {
		this.state_id = state_id;
	}
	public UUID getCountry_id() {
		return country_id;
	}
	public void setCountry_id(UUID country_id) {
		this.country_id = country_id;
	}
	public UUID getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(UUID department_id) {
		this.department_id = department_id;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}

	

}
