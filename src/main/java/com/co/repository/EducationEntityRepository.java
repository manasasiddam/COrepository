package com.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.EducationEntity;



public interface EducationEntityRepository extends JpaRepository<EducationEntity, Serializable> {

	public EducationEntity findByCaseNum(Long caseNum);

}
