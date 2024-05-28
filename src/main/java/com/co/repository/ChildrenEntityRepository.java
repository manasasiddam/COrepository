package com.co.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.ChildrenEntity;


public interface ChildrenEntityRepository extends JpaRepository<ChildrenEntity, Serializable> {

	public List<ChildrenEntity> findByCaseNum(Long caseNum);

}
