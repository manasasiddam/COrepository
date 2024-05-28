package com.co.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.EligDtlsEntity;

public interface EligDtlsRepository extends JpaRepository<EligDtlsEntity, Serializable> {
	
	public EligDtlsEntity findByCaseNum(Long caseNum);

}