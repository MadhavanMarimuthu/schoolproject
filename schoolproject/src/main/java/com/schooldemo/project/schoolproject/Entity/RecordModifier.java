package com.schooldemo.project.schoolproject.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.schooldemo.project.schoolproject.Enum.Status;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "modifiedOn", "createdOn", "deletedOn", "deletedBy", "modifiedBy", "createdBy","status" })
public class RecordModifier {
		@CreatedBy
		@Column(name = "created_by", nullable = true, updatable = false)
		private String createdBy;

		@CreatedDate
		@Column(name = "created_on", nullable = true, updatable = false)
		private LocalDateTime createdOn;

		@LastModifiedBy
		@Column(name = "modified_by", nullable = true)
		private String modifiedBy;

		@LastModifiedDate
		@Column(name = "modified_on", nullable = true)
		private LocalDateTime modifiedOn;

		@Column(name = "deleted_on")
		private Date deletedOn;

		@Column(name = "deleted_by")
		private String deletedBy;

//		@NotNull(message = "Status cannot be blank")
//		@ApiModelProperty(value = "Valid status", required = true, allowableValues = "ACTIVE, INACTIVE")
		@Enumerated(EnumType.STRING)
		@Column(name = "status")
		private Status status;

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public LocalDateTime getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(LocalDateTime createdOn) {
			this.createdOn = createdOn;
		}

		public String getModifiedBy() {
			return modifiedBy;
		}

		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}

		public LocalDateTime getModifiedOn() {
			return modifiedOn;
		}

		public void setModifiedOn(LocalDateTime modifiedOn) {
			this.modifiedOn = modifiedOn;
		}

		public Date getDeletedOn() {
			return deletedOn;
		}

		public void setDeletedOn(Date deletedOn) {
			this.deletedOn = deletedOn;
		}

		public String getDeletedBy() {
			return deletedBy;
		}

		public void setDeletedBy(String deletedBy) {
			this.deletedBy = deletedBy;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

	}

