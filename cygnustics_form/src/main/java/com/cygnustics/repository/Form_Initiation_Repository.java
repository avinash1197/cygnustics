package com.cygnustics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cygnustics.model.Form_Initiation;

@Repository
public interface Form_Initiation_Repository extends JpaRepository<Form_Initiation, Long> {

}
