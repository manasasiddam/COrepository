package com.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.DcCasesEntity;



public interface DcCasesEntityRepository extends JpaRepository<DcCasesEntity, Serializable> {

}
