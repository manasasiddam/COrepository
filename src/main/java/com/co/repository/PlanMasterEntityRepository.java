package com.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.PlanMasterEntity;


public interface PlanMasterEntityRepository extends JpaRepository<PlanMasterEntity, Serializable> {

}
