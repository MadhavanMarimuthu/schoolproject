package com.schooldemo.project.schoolproject.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.Formula;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.schooldemo.project.schoolproject.Enum.GenderType;
import com.schooldemo.project.schoolproject.Enum.Title;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_faculty_test")
@NoArgsConstructor
public class FacultyEntity extends RecordModifier implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "id", updatable = false, nullable = false)
	private UUID facultyId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;


	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private GenderType gender;


	@Enumerated(EnumType.STRING)
	@Column(name = "title")
	private Title title;

	@Column(name = "street")
	private String street;

	  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "country_id")
	private CountryEntity countryObj;

	  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "state_id")
	private StateEntity stateObj;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "city_id")
	private CityEntity cityObj;


	@Column(name = "postal_code")
	private String postalCode;


	@Column(name = "phone_no")
	private String phoneNo;
	

	@Column(name = "emergency_phone_no")
	private String emergencyPhoneNumber;


	@Column(name = "email")
	private String email;
	
	
	//@NotNull(message = "Department cannot be blank")
	  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id")
	private DepartmentEntity departmentObj;


	@Column(name = "designation")
	private String designation;
	

	@Column(name = "experience")
	private String experience;
	
	@Formula(value = "Concat(first_name,' ',last_name)")
	private String concatFields;

	

	

}



