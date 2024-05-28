package com.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.IncomeEntity;



public interface IncomeEntityRepository extends JpaRepository<IncomeEntity, Serializable> {

	public IncomeEntity findByCaseNum(Long caseNum);
}
