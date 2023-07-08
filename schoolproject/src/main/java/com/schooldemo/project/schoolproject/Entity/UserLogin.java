package com.schooldemo.project.schoolproject.Entity;


import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.schooldemo.project.schoolproject.Enum.UserType;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "tb_userlogin_test")
public class UserLogin extends RecordModifier implements Serializable{
	

		private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(generator = "UUID")
		@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
		@Type(type = "uuid-char")
		@Column(name = "user_id", updatable = false, nullable = false)
		private UUID userId;
			
		@Enumerated(EnumType.STRING)
		@Column(name = "user_type")
		private UserType userType;
		
		@Type(type = "uuid-char")
		@Column(name = "reference_id")
		private UUID referenceId;

	//	@NotNull(message = "User Name cannot be blank")
		@Column(name = "user_name")
		private String userName;

		@JsonIgnore
		@Column(name = "password")
		private String password;

	//	@NotNull(message = "phoneNo cannot be blank")
		@Column(name = "phone_no")
		private String phoneNo;

	//	@NotNull(message = "Email cannot be blank")
		@Column(name = "email")
		private String email;

		@Column(name = "force_password_change")
		private Boolean forcePasswordChange;

		@Column(name = "is_locked")
		private Boolean isLocked;

		@Column(name = "is_deleted")
		private Boolean isDeleted;
		
	

//		@ManyToMany(fetch = FetchType.EAGER)
//		@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", updatable = false),
//		inverseJoinColumns = @JoinColumn(name = "role_id", updatable = false))
//		private Set<RoleMaster> roles = new HashSet<RoleMaster>();
//
//		@Transient
//		private List<UserAccess> userAccessList;
//
//		@Transient
//		private List<MultiFactorAuthentication> multiFactorAuthenticationList;
//
//		@Transient
//		private Map<AuthenticationType, MultiFactorAuthentication> authTypeMap;
//
//		@Transient
//		private Map<UUID, UserAccess> stdIdUserAccessmap;
	
}
