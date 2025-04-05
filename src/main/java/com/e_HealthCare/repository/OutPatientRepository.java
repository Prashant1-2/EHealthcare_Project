package com.e_HealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_HealthCare.entity.OutPatient;

@Repository
public interface OutPatientRepository extends JpaRepository<OutPatient, Integer> {
}

