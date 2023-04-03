package com.cygnustics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cygnustics.model.Root_Cause_Analysis;

@Repository
public interface Root_Cause_Analysis_Repository extends JpaRepository<Root_Cause_Analysis, Long> {

}
