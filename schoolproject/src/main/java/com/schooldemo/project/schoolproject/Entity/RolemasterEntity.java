package com.schooldemo.project.schoolproject.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_role_test")
@Getter
@Setter
public class RolemasterEntity extends RecordModifier implements Serializable {
	
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(generator = "UUID")
		@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
		@Type(type = "uuid-char")
		@Column(name = "id", updatable = false, nullable = false)
		private UUID id;

//		@NotNull(message = "Name cannot be empty")
//		@ApiModelProperty(value = "name", required = true, allowableValues = "String")
		@Column(name = "role_name")
		private String roleName;
		
//		@NotNull(message = "Name cannot be empty")
//		@ApiModelProperty(value = "name", required = true, allowableValues = "String")
		@Column(name = "action_description")
		private String description;
		
	}


