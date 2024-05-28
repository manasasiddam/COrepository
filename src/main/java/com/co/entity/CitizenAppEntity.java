package com.co.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="CITIZEN_APP")
public class CitizenAppEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AppId;
	
	private String fullName;
	
	private String email;
	
	private Long mobileNumber;
	
	private String gender;
	
	private Long ssn;
	
	private String stateName;
	
	private LocalDate dateOfBirth;
	
	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	private String createdBy;
	
	private String updatedBy;

	}

