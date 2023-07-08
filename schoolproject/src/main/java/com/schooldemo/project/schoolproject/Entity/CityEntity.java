package com.schooldemo.project.schoolproject.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_city_test")
public class CityEntity extends RecordModifier implements Serializable{

			private static final long serialVersionUID = 1L;

			@Id
			@GeneratedValue(generator = "UUID")
			@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
			@Type(type = "uuid-char")
			@Column(name = "id", updatable = false, nullable = false)
			private UUID id;
	
			@Column(name = "name",nullable = true)
			private String cityName;


			@Column(name = "short_name",nullable = true)
			private String cityshortName;
			
		

			  @OneToOne(cascade = CascadeType.ALL)
			  @JoinColumn(name = "state_id")
			  private StateEntity stateObj;
			  


		}
