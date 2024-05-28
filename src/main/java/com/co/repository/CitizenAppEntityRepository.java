package com.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.entity.CitizenAppEntity;


public interface CitizenAppEntityRepository extends JpaRepository<CitizenAppEntity, Serializable> {

}
